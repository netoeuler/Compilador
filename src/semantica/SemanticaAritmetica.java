package semantica;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.ADivisaoExpressao;
import compilador.node.AIdentificadorVariavel;
import compilador.node.AMaisExpressao;
import compilador.node.AMenosExpressao;
import compilador.node.AMultExpressao;
import compilador.node.ANumeroInteiroValor;
import compilador.node.ANumeroRealValor;
import compilador.node.AStringValor;
import compilador.node.AValorExpressao;
import compilador.node.AVariavelExpressao;
import compilador.node.TIdentificador;
import compilador.node.TNumeroInteiro;
import compilador.node.TNumeroReal;
import compilador.node.TString;

public class SemanticaAritmetica extends AnalisadorSemantico{
	
	private Object valorExpressaoAritmetica = null;
	
	@Override
	public void outAMaisExpressao(AMaisExpressao node) {
		if (valorExpressaoAritmetica != null){
			node.setL((AValorExpressao) valorExpressaoAritmetica);
			valorExpressaoAritmetica = null;
		}
		
		operacaoAritmetica(node.getL(), node.getR(), "Soma");
	}
	
	@Override
	public void outAMenosExpressao(AMenosExpressao node) {
		if (valorExpressaoAritmetica != null){
			node.setL((AValorExpressao) valorExpressaoAritmetica);
			valorExpressaoAritmetica = null;
		}
		
		operacaoAritmetica(node.getL(), node.getR(), "Subtracao");
	}
	
	@Override
	public void outAMultExpressao(AMultExpressao node) {
		if (valorExpressaoAritmetica != null){
			node.setL((AValorExpressao) valorExpressaoAritmetica);
			valorExpressaoAritmetica = null;
		}
		
		operacaoAritmetica(node.getL(), node.getR(), "Multiplicação");
	}
	
	@Override
	public void outADivisaoExpressao(ADivisaoExpressao node) {
		if (valorExpressaoAritmetica != null){
			node.setL((AValorExpressao) valorExpressaoAritmetica);
			valorExpressaoAritmetica = null;
		}
		
		operacaoAritmetica(node.getL(), node.getR(), "Divisão");
	}
	
	private void operacaoAritmetica(Object nodeL, Object nodeR, String operacao){		
		Object left, right;
		
		left = getValorNo(nodeL);
		right = getValorNo(nodeR);
		
		if (left == null || right == null)
			return;
		
		if (nodeL instanceof AVariavelExpressao || nodeL instanceof AValorExpressao){
			if (!left.getClass().equals(right.getClass())){
				int linha=0,pos=0;
				if (left instanceof TNumeroInteiro){
					linha = ((TNumeroInteiro) left).getLine();
					pos = ((TNumeroInteiro) left).getPos();
				}
				else if (left instanceof TNumeroReal){
					linha = ((TNumeroReal) left).getLine();
					pos = ((TNumeroReal) left).getPos();
				}
				else{
					linha = ((TString) left).getLine();
					pos = ((TString) left).getPos();
				}
				
				System.out.println("["+linha+","+pos+"] "+operacao+" inválida");				
			}			
		}
		//else{
			if (left instanceof TNumeroInteiro){
				Integer soma = Integer.parseInt( ((TNumeroInteiro) left).getText() );
				soma += Integer.parseInt( ((TNumeroInteiro) right).getText() );
				
				/*AValorExpressao aux = (AValorExpressao) nodeL;				
				((ANumeroInteiroValor)aux.getValor()).getNumeroInteiro().setText(soma.toString());
				valorExpressaoAritmetica = aux;*/
				valorExpressaoAritmetica = definirNovoValorExpressaoAritmetica(soma.toString());
			}
			else if (left instanceof TNumeroReal){
				Integer soma = Integer.parseInt( ((TNumeroReal) left).getText() );
				soma += Integer.parseInt( ((TNumeroReal) right).getText() );
				
				AValorExpressao aux = (AValorExpressao) nodeL;
				((ANumeroRealValor)aux.getValor()).getNumeroReal().setText(soma.toString());
				valorExpressaoAritmetica = aux;				
			}
		//}
	}
	
	private Object getValorNo(Object node){
		if (node instanceof AValorExpressao){
			if (((AValorExpressao) node).getValor() instanceof ANumeroInteiroValor)
				return ((ANumeroInteiroValor) ((AValorExpressao) node).getValor()).getNumeroInteiro();			
			else if (((AValorExpressao) node).getValor() instanceof ANumeroRealValor)
				return ((ANumeroRealValor) ((AValorExpressao) node).getValor()).getNumeroReal();			
			else
				return ((AStringValor) ((AValorExpressao) node).getValor()).getString();
		}
		else if (node instanceof AVariavelExpressao){
			AIdentificadorVariavel a = ((AIdentificadorVariavel) ((AVariavelExpressao) node).getVariavel());
			Object[] dadosSimbolo = tabelaDeSimbolos.get(a.getIdentificador().getText());
			
			if (dadosSimbolo == null){
				System.out.print("["+a.getIdentificador().getLine()+","+a.getIdentificador().getPos()+"] ");
				System.out.println(a.getIdentificador().getText() + ": variável não declarada.");
				return null;
			}
			else if (dadosSimbolo[2] == null){
				System.out.print("["+a.getIdentificador().getLine()+","+a.getIdentificador().getPos()+"] ");
				System.out.println(a.getIdentificador().getText() + ": sem valor associado à variável.");
				return null;
			} else
				return dadosSimbolo[2];
		}
		
		return null;
	}
	
	private Object definirNovoValorExpressaoAritmetica(String valor){
		AValorExpressao aux = new AValorExpressao();
		aux.setValor(new ANumeroInteiroValor());		
		((ANumeroInteiroValor)aux.getValor()).setNumeroInteiro(new TNumeroInteiro(valor));
		//((ANumeroInteiroValor)aux.getValor()).getNumeroInteiro().setText(valor);
		return aux;
	}

}
