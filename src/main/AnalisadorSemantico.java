package main;

import java.util.HashMap;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.AAtribuicaoComandos;
import compilador.node.ACaractereTipo;
import compilador.node.ADeclaracaoConstanteParteDeclaracao;
import compilador.node.ADeclaracaoVariavelParteDeclaracao;
import compilador.node.AEsqueletoPrograma;
import compilador.node.AFatorTermo;
import compilador.node.AIdIdVirgula;
import compilador.node.AIdentificadorVariavel;
import compilador.node.AInteiroTipo;
import compilador.node.AMaisExpressao;
import compilador.node.AMenosExpressao;
import compilador.node.ANumeroInteiroAtrib1;
import compilador.node.ANumeroInteiroValor;
import compilador.node.ANumeroRealAtrib1;
import compilador.node.ANumeroRealValor;
import compilador.node.ARealTipo;
import compilador.node.AStringAtrib1;
import compilador.node.AStringValor;
import compilador.node.ATermoExpressao;
import compilador.node.AValorFator;
import compilador.node.AVetorVariavel;
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
			AVetorVariavel var = (AVetorVariavel) node.getVariavel();
			Object expressao = node.getExpressao();
			expressao = node.getExpressao().toString().substring(0,expressao.toString().length()-1);
			int tamLimiteVetor = Integer.parseInt( ((TNumeroInteiro) dadosSimbolo[3]).getText() );
			
			if (dadosSimbolo[0] instanceof AInteiroTipo){
				Integer exp;;
				try{
					exp = Integer.parseInt(expressao.toString());
				} catch (Exception e){
					System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
					System.out.println("Atribuição inválida");
				}				
			}
			else if (dadosSimbolo[0] instanceof ACaractereTipo){
				String valorAtribuido = expressao.toString().replace("'", "");
				
				int tamStringDecl = valorAtribuido.length();
				
				if (valorAtribuido.length() > 1)
					erro = true;
				if (Integer.parseInt(var.getNumeroInteiro().getText()) >= tamLimiteVetor)
					erro = true;
				if (tamStringDecl > tamLimiteVetor)
					erro = true;
			}
			
			if (erro){
				System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
				System.out.println(identificador.getText() + ": Limite do vetor superado.");
			}
		}
		else{
			boolean erro = false;
			Object expressao = null;
			if (node.getExpressao() instanceof ATermoExpressao){
				AFatorTermo fator = (AFatorTermo) ((ATermoExpressao) node.getExpressao()).getTermo();
				AValorFator valor = (AValorFator) fator.getFator();
				expressao = valor.getValor();
				
				erro = isErroTipo(node.getVariavel(), expressao, dadosSimbolo[0]);
			}
			else {
				String[] lista = node.getExpressao().toString().split(" ");
				for (String exp : lista){
					Integer numero;
					try{
						numero = Integer.parseInt(exp);
					} catch(Exception e){
						System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
						System.out.println("Atribuição inválida");
					}
				}
			}
			
			//erro = isErroTipo(node.getVariavel(), expressao, dadosSimbolo[0]);
			
			if (erro){
				System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
				System.out.println("Atribuição inválida");
			}
		}
	}
	
	private boolean isErroTipo(Object variavel, Object expressao, Object dadoSimbolo){
		if (variavel instanceof AVetorVariavel)
			return true;
		else if (dadoSimbolo instanceof ANumeroInteiroValor){
			if (expressao instanceof ANumeroInteiroAtrib1)
				return false;
			else
				return true;
		}
		else if (dadoSimbolo instanceof ANumeroRealValor){
			if (expressao instanceof ANumeroRealAtrib1)
				return false;
			else
				return true;
		}
		else if (dadoSimbolo instanceof ACaractereTipo){
			if (expressao instanceof AStringValor)
				return false;
			else
				return true;
		}
		
		return false;
	}
	
	@Override
	public void outAEsqueletoPrograma(AEsqueletoPrograma node) {
		
	}

}
