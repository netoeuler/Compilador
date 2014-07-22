package main;

import java.util.HashMap;
import java.util.LinkedList;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.AAtribuicaoComandos;
import compilador.node.ACaractereTipo;
import compilador.node.ADeclaracaoConstanteParteDeclaracao;
import compilador.node.ADeclaracaoVariavelParteDeclaracao;
import compilador.node.ADivisaoTermo;
import compilador.node.AEscrevaComandos;
import compilador.node.AEsqueletoPrograma;
import compilador.node.AExpVirgula;
import compilador.node.AFatorTermo;
import compilador.node.AIdIdVirgula;
import compilador.node.AIdentificadorVariavel;
import compilador.node.AInteiroTipo;
import compilador.node.AMaisExpressao;
import compilador.node.AMenosExpressao;
import compilador.node.AMultTermo;
import compilador.node.ANumeroInteiroAtrib1;
import compilador.node.ANumeroInteiroValor;
import compilador.node.ANumeroRealAtrib1;
import compilador.node.ANumeroRealValor;
import compilador.node.ARealTipo;
import compilador.node.AStringAtrib1;
import compilador.node.AStringValor;
import compilador.node.ATermoExpressao;
import compilador.node.AValorFator;
import compilador.node.AVariavelFator;
import compilador.node.AVetorVariavel;
import compilador.node.PExpVirgula;
import compilador.node.PExpressao;
import compilador.node.PParteDeclaracao;
import compilador.node.PVariavel;
import compilador.node.TIdentificador;
import compilador.node.TNumeroInteiro;
import compilador.node.TNumeroReal;

public class AnalisadorSemantico extends DepthFirstAdapter{
	
	private final String VARIAVEL = "var";
	private final String VETOR = "vetor";
	private final String CONSTANTE = "const";	
	
	private final int QTD_DADOS = 4;
	
	/**
	 * Object[] dadosSimbolo:
	 * 0 - tipo (inteiro,real,string)
	 * 1 - variável/constante 
	 * 2 - valor atribuído à variável
	 * 3 - número de posições, em caso de vetor
	 */
	
	HashMap<String, Object[]> tabelaDeSimbolos;	
	
	public AnalisadorSemantico() {
		tabelaDeSimbolos = new HashMap<String,Object[]>();
	}
	
	@Override
	public void outAEsqueletoPrograma(AEsqueletoPrograma node) {
		//super.outAEsqueletoPrograma(node);
	}
	
	@Override
	public void outADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node) {
		Object[] dadosSimbolo = new Object[QTD_DADOS];
		String[] variaveis = node.getIdVirgula().toString().split(" ");
		
		String est = VARIAVEL;
		
		if (node.getIdVirgula() instanceof AIdIdVirgula){
			AIdIdVirgula a = (AIdIdVirgula) node.getIdVirgula();
			if (a.getVariavel() instanceof AVetorVariavel){
				AVetorVariavel vetor = (AVetorVariavel) a.getVariavel();
				est = VETOR;
				dadosSimbolo[3] = vetor.getNumeroInteiro();				
				variaveis = new String[1]; 
				variaveis[0] = vetor.getIdentificador().getText().toString();
			}
		}
		
		for (String id : variaveis){
			dadosSimbolo[0] = node.getTipo();
			dadosSimbolo[1] = est;
			dadosSimbolo[2] = null;
			
			if (!tabelaDeSimbolos.containsKey(id))
				tabelaDeSimbolos.put(id,dadosSimbolo);
			else
				System.out.println("Duplicação da variável '"+id+"'");
		}	
	}
	
	@Override
	public void outADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node) {
		Object[] dadosSimbolo = new Object[QTD_DADOS];
		String id = node.getIdentificador().getText().toString();
		dadosSimbolo[0] = null;
		dadosSimbolo[1] = CONSTANTE;
		dadosSimbolo[2] = node.getValor().toString();
		
		if (!tabelaDeSimbolos.containsKey(id))
			tabelaDeSimbolos.put(id,dadosSimbolo);
		else
			System.out.println("Duplicação da variável '"+id+"'");		
	}
	
	@Override
	public void outAAtribuicaoComandos(AAtribuicaoComandos node) {		
		TIdentificador identificador = null;
		if (node.getVariavel() instanceof AIdentificadorVariavel){
			AIdentificadorVariavel var = (AIdentificadorVariavel) node.getVariavel();
			identificador = var.getIdentificador();
		}
		else if (node.getVariavel() instanceof AVetorVariavel){
			AVetorVariavel var = (AVetorVariavel) node.getVariavel();
			identificador = var.getIdentificador();
		}		
		
		Object[] dadosSimbolo = tabelaDeSimbolos.get(identificador.getText());		
		
		if (dadosSimbolo[1].equals(CONSTANTE)){
			System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
			System.out.println("Não é permitido atribuir valores a uma constante.");
		}
		else if (dadosSimbolo[1].equals(VETOR)){
			boolean erro = false;
			
			if (node.getVariavel() instanceof AVetorVariavel || dadosSimbolo[0] instanceof ACaractereTipo)
				erro = false;
			else
				erro = true;
			
			if (erro){
				System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
				System.out.println("Atribuição inválida para vetor.");
				return;
			}
			
			Object expressao = node.getExpressao();
			expressao = node.getExpressao().toString().substring(0,expressao.toString().length()-1);
			int tamLimiteVetor = Integer.parseInt( ((TNumeroInteiro) dadosSimbolo[3]).getText() );
			
			if (dadosSimbolo[0] instanceof AInteiroTipo){
				try{
					Integer.parseInt(expressao.toString());
				} catch (Exception e){
					System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
					System.out.println("Atribuição inválida");
				}				
			}
			else if (dadosSimbolo[0] instanceof ARealTipo){
				try{
					if (!expressao.toString().contains(","))
						Integer.parseInt(expressao.toString()+",");
				} catch (Exception e){
					System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
					System.out.println("Atribuição inválida");
				}				
			}
			else if (dadosSimbolo[0] instanceof ACaractereTipo){
				String valorAtribuido = expressao.toString().replace("'", "");
				
				int tamStringDecl = valorAtribuido.length();				
				
				if (node.getVariavel() instanceof AVetorVariavel){
					if (valorAtribuido.length() > 1)
						erro = true;
				}				
				if (tamStringDecl > tamLimiteVetor)
					erro = true;
			}
		}
		else{
			//boolean erro = false;
			Object expressao = null;
			if (node.getExpressao() instanceof ATermoExpressao){
				AFatorTermo fator = (AFatorTermo) ((ATermoExpressao) node.getExpressao()).getTermo();
				AValorFator valor = (AValorFator) fator.getFator();
				expressao = valor.getValor();
				
				if (isErroTipo(node.getVariavel(), expressao, dadosSimbolo[0])){
					System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
					System.out.println("Atribuição inválida");
				}
			}
			else {
				String[] lista = node.getExpressao().toString().split(" ");
				int caso; 
				if (dadosSimbolo[0] instanceof AInteiroTipo)
					caso=0;
				else if (dadosSimbolo[0] instanceof ARealTipo)
					caso=1;
				else
					caso=2;
				
				for (String exp : lista){							
					try{
						if (caso == 0)
							Integer.parseInt(exp);
						else if (caso == 1){
							if (!exp.contains(","))
								Integer.parseInt(exp+",0");
						}
					} catch(Exception e){
						System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
						System.out.println("Atribuição inválida");
					}
				}			
			}
		}
	}
	
	private boolean isErroTipo(Object variavel, Object expressao, Object dadoSimbolo){
		if (variavel instanceof AVetorVariavel)
			return true;
		else if (dadoSimbolo instanceof AInteiroTipo){
			if (expressao instanceof ANumeroInteiroAtrib1 
					|| expressao instanceof ANumeroInteiroValor)
				return false;
			else
				return true;
		}
		else if (dadoSimbolo instanceof ARealTipo){
			if (expressao instanceof ANumeroRealAtrib1
					|| expressao instanceof ANumeroRealValor)
				return false;
			else
				return true;
		}
		else if (dadoSimbolo instanceof ACaractereTipo){
			if (expressao instanceof AStringValor){
				AStringValor a = (AStringValor) expressao;
				if (a.getString().getText().length() > 1)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		
		return false;
	}
	
	@Override
	public void outAIdentificadorVariavel(AIdentificadorVariavel node) {		
		if (!tabelaDeSimbolos.containsKey(node.getIdentificador().getText())){
			System.out.print("["+node.getIdentificador().getLine()+","+node.getIdentificador().getPos()+"] ");
			System.out.println(node.getIdentificador().getText() + ": variável não declarada.");
		}
	}
	
	@Override
	public void outAVetorVariavel(AVetorVariavel node) {		
		Object[] dadosSimbolo = tabelaDeSimbolos.get(node.getIdentificador().getText());
		
		if (dadosSimbolo == null)
			return;
		
		int tamLimiteVetor = Integer.parseInt(dadosSimbolo[3].toString().trim());
		int posicaoRequisitada = Integer.parseInt(node.getNumeroInteiro().getText());
		
		if (posicaoRequisitada >= tamLimiteVetor){			
			System.out.print("["+node.getIdentificador().getLine()+","+node.getIdentificador().getPos()+"] ");
			System.out.println(node.getIdentificador().getText() + ": Limite do vetor superado.");
		}
	}
	
	@Override
	public void outAEscrevaComandos(AEscrevaComandos node) {
		LinkedList<PExpVirgula> expVirgula = node.getExpVirgula();
		/*for (PExpVirgula exp : expVirgula){
			if (exp instanceof AExpVirgula){
				ATermoExpressao termo = (ATermoExpressao) ((AExpVirgula)exp).getExpressao();
				AFatorTermo fator = (AFatorTermo) termo.getTermo();
				if (fator.getFator() instanceof AVariavelFator){
					AVariavelFator var = (AVariavelFator) fator.getFator();
					AIdentificadorVariavel idvar = (AIdentificadorVariavel) var.getVariavel();
					
					if (!tabelaDeSimbolos.containsKey(idvar.getIdentificador().getText())){
						System.out.print("["+idvar.getIdentificador().getLine()+","+idvar.getIdentificador().getPos()+"] ");
						System.out.println(idvar.getIdentificador().getText() + ": variável não declarada.");
					}
				}
			}
		}
		
		if (node.getExpressao() instanceof ATermoExpressao){
			ATermoExpressao termo = (ATermoExpressao) node.getExpressao();
			AFatorTermo fator = (AFatorTermo) termo.getTermo();
			if (fator.getFator() instanceof AVariavelFator){
				AVariavelFator var = (AVariavelFator) fator.getFator();
				AIdentificadorVariavel idvar = (AIdentificadorVariavel) var.getVariavel();
				
				if (!tabelaDeSimbolos.containsKey(idvar.getIdentificador().getText())){
					System.out.print("["+idvar.getIdentificador().getLine()+","+idvar.getIdentificador().getPos()+"] ");
					System.out.println(idvar.getIdentificador().getText() + ": variável não declarada.");
				}
			}			
		}*/		
	}
	
	@Override
	public void outAMaisExpressao(AMaisExpressao node) {
		String esq = node.getExpressao().toString().trim();
		String dir = node.getTermo().toString().trim();
		int linha=0,pos=0;
		
		AFatorTermo fator = (AFatorTermo) node.getTermo();
		AValorFator valorFator = (AValorFator) fator.getFator();
		if (valorFator.getValor() instanceof ANumeroInteiroValor){
			linha = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getLine();
			pos = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getPos();					
		}
		else if (valorFator.getValor() instanceof ANumeroRealValor){
			linha = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getLine();
			pos = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getPos();					
		}
		
		if (!operacaoAritmetica(esq, dir))
			System.out.println("["+linha+","+pos+"] Soma inválida");		
	}
	
	@Override
	public void outAMenosExpressao(AMenosExpressao node) {
		String esq = node.getExpressao().toString().trim();
		String dir = node.getTermo().toString().trim();
		int linha=0,pos=0;
		
		AFatorTermo fator = (AFatorTermo) node.getTermo();
		AValorFator valorFator = (AValorFator) fator.getFator();
		if (valorFator.getValor() instanceof ANumeroInteiroValor){
			linha = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getLine();
			pos = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getPos();					
		}
		else if (valorFator.getValor() instanceof ANumeroRealValor){
			linha = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getLine();
			pos = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getPos();					
		}
		
		if (!operacaoAritmetica(esq, dir))
			System.out.println("["+linha+","+pos+"] Subtração inválida");
	}
	
	@Override
	public void outAMultTermo(AMultTermo node) {
		String esq = node.getFator().toString().trim();
		String dir = node.getTermo().toString().trim();
		int linha=0,pos=0;
		
		AValorFator valorFator = (AValorFator) node.getFator();
		if (valorFator.getValor() instanceof ANumeroInteiroValor){
			linha = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getLine();
			pos = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getPos();					
		}
		else if (valorFator.getValor() instanceof ANumeroRealValor){
			linha = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getLine();
			pos = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getPos();					
		}
		
		if (!operacaoAritmetica(esq, dir))
			System.out.println("["+linha+","+pos+"] Multiplicação inválida");
	}
	
	@Override
	public void outADivisaoTermo(ADivisaoTermo node) {
		String esq = node.getFator().toString().trim();
		String dir = node.getTermo().toString().trim();
		int linha=0,pos=0;
		
		AValorFator valorFator = (AValorFator) node.getFator();
		if (valorFator.getValor() instanceof ANumeroInteiroValor){
			linha = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getLine();
			pos = ((ANumeroInteiroValor) valorFator.getValor()).getNumeroInteiro().getPos();					
		}
		else if (valorFator.getValor() instanceof ANumeroRealValor){
			linha = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getLine();
			pos = ((ANumeroRealValor) valorFator.getValor()).getNumeroReal().getPos();					
		}
		
		if (!operacaoAritmetica(esq, dir))
			System.out.println("["+linha+","+pos+"] Divisão inválida");
	}
	
	private boolean operacaoAritmetica(String esq, String dir){
		int tipo1,tipo2;
		
		if (esq.contains(","))
			tipo1=0;
		else if (esq.contains("'"))
			tipo1=1;
		else
			tipo1=2;
		
		if (dir.contains(","))
			tipo2=0;
		else if (dir.contains("'"))
			tipo2=1;
		else
			tipo2=2;
		
		if (tipo1 != tipo2)			
			return false;		
		
		return true;
	}
	
}
