package semantica;

import java.util.HashMap;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.AAtribuicaoComandos;
import compilador.node.ACaractereTipo;
import compilador.node.ADeclaracaoConstanteParteDeclaracao;
import compilador.node.ADeclaracaoVariavelParteDeclaracao;
import compilador.node.AIdIdVirgula;
import compilador.node.AIdentificadorVariavel;
import compilador.node.AInteiroTipo;
import compilador.node.ANumeroInteiroValor;
import compilador.node.ANumeroRealValor;
import compilador.node.ARealTipo;
import compilador.node.AStringValor;
import compilador.node.AValorExpressao;
import compilador.node.AVetorVariavel;
import compilador.node.TIdentificador;
import compilador.node.TNumeroInteiro;

public class AnalisadorSemantico extends DepthFirstAdapter{
	
	protected final String VARIAVEL = "var";
	protected final String VETOR = "vetor";
	protected final String CONSTANTE = "const";	
	
	private final int QTD_DADOS = 4;
	
	/**
	 * Object[] dadosSimbolo:
	 * 0 - tipo (inteiro,real,string)
	 * 1 - variável/constante 
	 * 2 - valor atribuído à variável
	 * 3 - número de posições, em caso de vetor
	 */
	
	protected HashMap<String, Object[]> tabelaDeSimbolos;	
	
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
		
		if (dadosSimbolo == null){
			System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
			System.out.println(identificador.getText() + ": variável não declarada.");
			return;
		}
		
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
			Object expressao = null;
			if (node.getExpressao() instanceof AValorExpressao){
				expressao = ((AValorExpressao) node.getExpressao()).getValor();
				
				if (expressao instanceof ANumeroInteiroValor && dadosSimbolo[0] instanceof AInteiroTipo){
					dadosSimbolo[2] = ((ANumeroInteiroValor) expressao).getNumeroInteiro();
					tabelaDeSimbolos.put(identificador.getText(), dadosSimbolo);
				}
				else if (expressao instanceof ANumeroRealValor && dadosSimbolo[0] instanceof ARealTipo){
					dadosSimbolo[2] = ((ANumeroRealValor) expressao).getNumeroReal();
					tabelaDeSimbolos.put(identificador.getText(), dadosSimbolo);
				}
				else if (expressao instanceof AStringValor && dadosSimbolo[0] instanceof ACaractereTipo){
					dadosSimbolo[2] = ((AStringValor) expressao).getString();
					tabelaDeSimbolos.put(identificador.getText(), dadosSimbolo);
				}
				else{
					System.out.print("["+identificador.getLine()+","+identificador.getPos()+"] ");
					System.out.println("Atribuição inválida");
				}
			}
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
	
	
	
}
