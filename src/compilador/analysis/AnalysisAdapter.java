/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEsqueletoPrograma(AEsqueletoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComandos(AAtribuicaoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComandos(ALeiaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComandos(AEscrevaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicionalComandos(ACondicionalComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComandos(AAvalieComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepeticaoComandos(ARepeticaoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdIdVirgula(AIdIdVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdvirgulaIdVirgula(AIdvirgulaIdVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorAtrib1(AIdentificadorAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroInteiroAtrib1(ANumeroInteiroAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealAtrib1(ANumeroRealAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringAtrib1(AStringAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpVirgula(AExpVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicional(ACondicional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSenao(ACondSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSenaoSub(ACondSenaoSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoRepeticao(AEnquantoRepeticao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaRepeticao(ARepitaRepeticao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaRepeticao(AParaRepeticao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaSub(AParaSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPassoateParaSubPasso(APassoateParaSubPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAteParaSubPasso(AAteParaSubPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaSubAte(AParaSubAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieCasoSub(AAvalieCasoSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieSenao(AAvalieSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorVariavel(AIdentificadorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOpRelacionalIgual(AIgualOpRelacionalIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteOpRelacionalIgual(ADiferenteOpRelacionalIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuOpLogicoOu(AOuOpLogicoOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorOpLogicoOu(AXorOpLogicoOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOpRelacionalComp(AMenorOpRelacionalComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualOpRelacionalComp(AMenorIgualOpRelacionalComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOpRelacionalComp(AMaiorOpRelacionalComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualOpRelacionalComp(AMaiorIgualOpRelacionalComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExpressao(AMaisExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpressao(AMenosExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelCompExpressao(ARelCompExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultTermo(AMultTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoTermo(ADivisaoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenFator(AParenFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFator(AValorFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFator(AVariavelFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpLogicoExpressaoLogica(AOpLogicoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoLogExpressaoLogica(ATermoLogExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAETermoLog(AETermoLog node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpRelTermoLog(AExpRelTermoLog node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExpRel(AIgualExpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoRelExpRel(ATermoRelExpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompTermoRel(ACompTermoRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorRelTermoRel(AFatorRelTermoRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenFatorRel(AParenFatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoparenFatorRel(ANaoparenFatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFatorRel(AValorFatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFatorRel(AVariavelFatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParen(AParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUnderscore(TUnderscore node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroInteiro(TNumeroInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSeta(TSeta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgualIgual(TIgualIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoEVirgula(TPontoEVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParen(TAbreParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParen(TFechaParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreChave(TAbreChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaChave(TFechaChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreComent(TAbreComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaComent(TFechaComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPonto(TFimPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharIgnored(TCharIgnored node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
