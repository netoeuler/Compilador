package main;

import java.util.HashMap;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.ADeclaracaoConstanteParteDeclaracao;
import compilador.node.ADeclaracaoVariavelParteDeclaracao;
import compilador.node.AEsqueletoPrograma;
import compilador.node.PParteDeclaracao;

public class AnalisadorSemantico extends DepthFirstAdapter{
	
	HashMap<String, Object[]> tabelaDeSimbolos;
	
	public AnalisadorSemantico() {
		tabelaDeSimbolos = new HashMap<String,Object[]>();		
	}
	
	@Override
	public void outAEsqueletoPrograma(AEsqueletoPrograma node) {
		if (node.getParteDeclaracao() != null){
			Object[] dadosSimbolo;			
			
			for (PParteDeclaracao dec : node.getParteDeclaracao()){
				dadosSimbolo = new Object[2];
				if (dec instanceof ADeclaracaoVariavelParteDeclaracao){
					ADeclaracaoVariavelParteDeclaracao decAux = (ADeclaracaoVariavelParteDeclaracao) dec;
					String[] variaveis = decAux.getIdVirgula().toString().split(" ");
					for (String id : variaveis){
						//String id = decAux.getIdVirgula().toString();
						String tipo = decAux.getTipo().toString();
						dadosSimbolo[0] = tipo;
						dadosSimbolo[1] = "var";						
						tabelaDeSimbolos.put(id,dadosSimbolo);
					}					
				}
				else if (dec instanceof ADeclaracaoConstanteParteDeclaracao){
					ADeclaracaoConstanteParteDeclaracao decAux = (ADeclaracaoConstanteParteDeclaracao) dec;
					String id = decAux.getIdentificador().toString();
					String tipo = decAux.getTipo().toString();
					dadosSimbolo[0] = tipo;
					dadosSimbolo[1] = "const";
					tabelaDeSimbolos.put(id,dadosSimbolo);
				}
			}
		}
		
		//super.outAEsqueletoPrograma(node);
	}

}
