/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStartStart(AStartStart node);
    void caseAEsqueletoEsqueletoPrograma(AEsqueletoEsqueletoPrograma node);
    void caseADeclaracaoParteDeclaracao(ADeclaracaoParteDeclaracao node);
    void caseAAtribuicaoParteComandos(AAtribuicaoParteComandos node);
    void caseALeiaParteComandos(ALeiaParteComandos node);
    void caseAEscrevaParteComandos(AEscrevaParteComandos node);
    void caseACondicionalParteComandos(ACondicionalParteComandos node);
    void caseARepeticaoParteComandos(ARepeticaoParteComandos node);
    void caseAIfACondicional(AIfACondicional node);
    void caseAIfNaCondicional(AIfNaCondicional node);
    void caseAIfA1IfAssociado(AIfA1IfAssociado node);
    void caseAIfNa1IfNaoAssociado(AIfNa1IfNaoAssociado node);
    void caseAIfNa2IfNaoAssociado(AIfNa2IfNaoAssociado node);
    void caseAEnquantoRepeticao(AEnquantoRepeticao node);
    void caseARepitaRepeticao(ARepitaRepeticao node);
    void caseAParaRepeticao(AParaRepeticao node);
    void caseAIdVirgulaIdVirgula(AIdVirgulaIdVirgula node);
    void caseAExpVirgulaExpVirgula(AExpVirgulaExpVirgula node);
    void caseACmdPontoVirgulaCmdPontoVirgula(ACmdPontoVirgulaCmdPontoVirgula node);
    void caseAFpPvFimParaPontoVirgula(AFpPvFimParaPontoVirgula node);
    void caseAAtribIdAtrib1(AAtribIdAtrib1 node);
    void caseAAtribNumAtrib1(AAtribNumAtrib1 node);
    void caseAAtribStrAtrib1(AAtribStrAtrib1 node);
    void caseAPSubAteParaSub(APSubAteParaSub node);
    void caseAPSubPasso1ParaSubPasso(APSubPasso1ParaSubPasso node);
    void caseAPSubPasso2ParaSubPasso(APSubPasso2ParaSubPasso node);
    void caseAPSubAteParaSubAte(APSubAteParaSubAte node);
    void caseAValorExpressao(AValorExpressao node);
    void caseAExpIdExpressao(AExpIdExpressao node);
    void caseAIgualdadeExpressaoLogica(AIgualdadeExpressaoLogica node);

    void caseTCommentLine(TCommentLine node);
    void caseTComentBloco(TComentBloco node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTNumero(TNumero node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTDivisao(TDivisao node);
    void caseTMult(TMult node);
    void caseTSoma(TSoma node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaior(TMaior node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTSeta(TSeta node);
    void caseTIgualIgual(TIgualIgual node);
    void caseTDiferente(TDiferente node);
    void caseTIgual(TIgual node);
    void caseTPontoEVirgula(TPontoEVirgula node);
    void caseTVirgula(TVirgula node);
    void caseTAbreParen(TAbreParen node);
    void caseTFechaParen(TFechaParen node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTAbreChave(TAbreChave node);
    void caseTFechaChave(TFechaChave node);
    void caseTAbreComent(TAbreComent node);
    void caseTFechaComent(TFechaComent node);
    void caseTPonto(TPonto node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTPrograma(TPrograma node);
    void caseTVar(TVar node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTFaca(TFaca node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTInicio(TInicio node);
    void caseTFimPonto(TFimPonto node);
    void caseTFimSe(TFimSe node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTFimPara(TFimPara node);
    void caseTFim(TFim node);
    void caseTTipo(TTipo node);
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTNomePrograma(TNomePrograma node);
    void caseTString(TString node);
    void caseTValor(TValor node);
    void caseTIdentificador(TIdentificador node);
    void caseTCharIgnored(TCharIgnored node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
