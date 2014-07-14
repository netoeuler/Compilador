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
    public void caseAStartStart(AStartStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEsqueletoEsqueletoPrograma(AEsqueletoEsqueletoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracao(ADeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoParteDeclaracao(ADeclaracaoParteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracao2ParteDeclaracao(ADeclaracao2ParteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoParteComandos(AAtribuicaoParteComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaParteComandos(ALeiaParteComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaParteComandos(AEscrevaParteComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicionalParteComandos(ACondicionalParteComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepeticaoParteComandos(ARepeticaoParteComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfACondicional(AIfACondicional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSenao(ACondSenao node)
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
    public void caseAIdVirgulaIdVirgula(AIdVirgulaIdVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpVirgulaExpVirgula(AExpVirgulaExpVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFpPvFimParaPontoVirgula(AFpPvFimParaPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribIdAtrib1(AAtribIdAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribNumAtrib1(AAtribNumAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribNum2Atrib1(AAtribNum2Atrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribStrAtrib1(AAtribStrAtrib1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPSubAteParaSub(APSubAteParaSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPSubPasso1ParaSubPasso(APSubPasso1ParaSubPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPSubPasso2ParaSubPasso(APSubPasso2ParaSubPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPSubAteParaSubAte(APSubAteParaSubAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAV1Valor(AV1Valor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAV2Valor(AV2Valor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAV3Valor(AV3Valor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAV1Variavel(AV1Variavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAV2Variavel(AV2Variavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipo(AIntTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisSoma(AMaisSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosSoma(AMenosSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultMultiplicacao(AMultMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivMultiplicacao(ADivMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpr1OpRelacional(AOpr1OpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpr2OpRelacional(AOpr2OpRelacional node)
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
    public void caseAEOpLogico(AEOpLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuOpLogico(AOuOpLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorOpLogico(AXorOpLogico node)
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
    public void caseAE1ExpressaoGeral(AE1ExpressaoGeral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAE2ExpressaoGeral(AE2ExpressaoGeral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp1Expressao(AExp1Expressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATerm1Termo(ATerm1Termo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFator1Fator(AFator1Fator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumFator(ANumFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdFator(AIdFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpl1ExpressaoLogica(AExpl1ExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpl2ExpressaoLogica(AExpl2ExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermol1TermoLog(ATermol1TermoLog node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermol2TermoLog(ATermol2TermoLog node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr1ExpRel(AExpr1ExpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr2ExpRel(AExpr2ExpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermor1TermoRel(ATermor1TermoRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermor2TermoRel(ATermor2TermoRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFr1FatorRel(AFr1FatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFr2FatorRel(AFr2FatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFr3FatorRel(AFr3FatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFr4FatorRel(AFr4FatorRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPParen(APParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentLine(TCommentLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentBloco(TComentBloco node)
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
