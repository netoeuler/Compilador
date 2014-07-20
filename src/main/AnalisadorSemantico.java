package main;

import java.util.HashMap;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.AAtribuicaoComandos;
import compilador.node.ACaractereTipo;
import compilador.node.ADeclaracaoConstanteParteDeclaracao;
import compilador.node.ADeclaracaoVariavelParteDeclaracao;
import compilador.node.AEsqueletoPrograma;
import compilador.node.AInteiroTipo;
import compilador.node.ANumeroInteiroAtrib1;
import compilador.node.ANumeroRealAtrib1;
import compilador.node.ARealTipo;
import compilador.node.AStringAtrib1;
import compilador.node.PParteDeclaracao;
import compilador.node.TNumeroReal;

public class AnalisadorSemantico extends DepthFirstAdapter{
	
	private final String VARIAVEL = "var";
	private final String CONSTANTE = "const";	
	
	private final int QTD_DADOS = 3;
	
	/**
	 * Object[] dadosSimbolo:
	 * 0 - tipo (inteiro,real,string)
	 * 1 - variável/constante 
	 * 2 - valor atribuído à variável
	 */
	
	HashMap<String, Object[]> tabelaDeSimbolos;
	
	public AnalisadorSemantico() {
		tabelaDeSimbolos = new HashMap<String,Object[]>();		
	}
	
	@Override
	public void outADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node) {
		Object[] dadosSimbolo = new Object[QTD_DADOS];
		String[] variaveis = node.getIdVirgula().toString().split(" ");
		for (String id : variaveis){
			dadosSimbolo[0] = node.getTipo();
			dadosSimbolo[1] = VARIAVEL;
			dadosSimbolo[2] = null;
			tabelaDeSimbolos.put(id,dadosSimbolo);
		}	
	}
	
	@Override
	public void outADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node) {
		Object[] dadosSimbolo = new Object[QTD_DADOS];
		String id = node.getIdentificador().getText().toString();
		dadosSimbolo[0] = null;
		dadosSimbolo[1] = CONSTANTE;
		dadosSimbolo[2] = node.getValor().toString();
		tabelaDeSimbolos.put(id,dadosSimbolo);
	}
	
	@Override
	public void outAAtribuicaoComandos(AAtribuicaoComandos node) {		
		Object[] dadosSimbolo = tabelaDeSimbolos.get(node.getIdentificador().getText());		
		
		if (dadosSimbolo[1].equals(CONSTANTE)){
			System.out.print("["+node.getIdentificador().getLine()+","+node.getIdentificador().getPos()+"] ");
			System.out.println("Não é permitido atribuir valores a uma constante.");
		}
		else{
			boolean erro = false;
			if (dadosSimbolo[0] instanceof AInteiroTipo){
				if (node.getAtrib1() instanceof ANumeroInteiroAtrib1)
					erro = false;
				else
					erro = true;
			}
			else if (dadosSimbolo[0] instanceof ARealTipo){
				if (node.getAtrib1() instanceof ANumeroRealAtrib1)
					erro = false;
				else
					erro = true;
			}
			else if (dadosSimbolo[0] instanceof ACaractereTipo){
				if (node.getAtrib1() instanceof AStringAtrib1)
					erro = false;
				else
					erro = true;
			}
			
			if (erro){
				System.out.print("["+node.getIdentificador().getLine()+","+node.getIdentificador().getPos()+"] ");
				System.out.println("Atribuição inválida");
			}
		}
	}
	
	@Override
	public void outAEsqueletoPrograma(AEsqueletoPrograma node) {
		
	}

}
