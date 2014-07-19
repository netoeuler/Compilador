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
    void caseAStart(AStart node);
    void caseAEsqueletoPrograma(AEsqueletoPrograma node);
    void caseADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node);
    void caseADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node);
    void caseARealTipo(ARealTipo node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseASocomandoParteComandos(ASocomandoParteComandos node);
    void caseAOutrocomandoParteComandos(AOutrocomandoParteComandos node);
    void caseAAtribuicaoComandos(AAtribuicaoComandos node);
    void caseALeiaComandos(ALeiaComandos node);
    void caseAEscrevaComandos(AEscrevaComandos node);
    void caseACondicionalComandos(ACondicionalComandos node);
    void caseARepeticaoComandos(ARepeticaoComandos node);
    void caseAIdIdVirgula(AIdIdVirgula node);
    void caseAIdvirgulaIdVirgula(AIdvirgulaIdVirgula node);
    void caseAIdentificadorAtrib1(AIdentificadorAtrib1 node);
    void caseANumeroInteiroAtrib1(ANumeroInteiroAtrib1 node);
    void caseANumeroRealAtrib1(ANumeroRealAtrib1 node);
    void caseAStringAtrib1(AStringAtrib1 node);
    void caseAExpVirgula(AExpVirgula node);
    void caseACondicional(ACondicional node);
    void caseACondSenao(ACondSenao node);
    void caseACondSenaoSub(ACondSenaoSub node);
    void caseAEnquantoRepeticao(AEnquantoRepeticao node);
    void caseARepitaRepeticao(ARepitaRepeticao node);
    void caseAParaRepeticao(AParaRepeticao node);
    void caseAParaSub(AParaSub node);
    void caseAPassoateParaSubPasso(APassoateParaSubPasso node);
    void caseAAteParaSubPasso(AAteParaSubPasso node);
    void caseAParaSubAte(AParaSubAte node);
    void caseAStringValor(AStringValor node);
    void caseANumeroInteiroValor(ANumeroInteiroValor node);
    void caseANumeroRealValor(ANumeroRealValor node);
    void caseAIdentificadorVariavel(AIdentificadorVariavel node);
    void caseAVetorVariavel(AVetorVariavel node);
    void caseAIgualOpRelacionalIgual(AIgualOpRelacionalIgual node);
    void caseADiferenteOpRelacionalIgual(ADiferenteOpRelacionalIgual node);
    void caseAOuOpLogicoOu(AOuOpLogicoOu node);
    void caseAXorOpLogicoOu(AXorOpLogicoOu node);
    void caseAMenorOpRelacionalComp(AMenorOpRelacionalComp node);
    void caseAMenorIgualOpRelacionalComp(AMenorIgualOpRelacionalComp node);
    void caseAMaiorOpRelacionalComp(AMaiorOpRelacionalComp node);
    void caseAMaiorIgualOpRelacionalComp(AMaiorIgualOpRelacionalComp node);
    void caseAMaisExpressao(AMaisExpressao node);
    void caseAMenosExpressao(AMenosExpressao node);
    void caseATermoExpressao(ATermoExpressao node);
    void caseAMultTermo(AMultTermo node);
    void caseADivisaoTermo(ADivisaoTermo node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAParenFator(AParenFator node);
    void caseAValorFator(AValorFator node);
    void caseAVariavelFator(AVariavelFator node);
    void caseAOpLogicoExpressaoLogica(AOpLogicoExpressaoLogica node);
    void caseATermoLogExpressaoLogica(ATermoLogExpressaoLogica node);
    void caseAETermoLog(AETermoLog node);
    void caseAExpRelTermoLog(AExpRelTermoLog node);
    void caseAIgualExpRel(AIgualExpRel node);
    void caseATermoRelExpRel(ATermoRelExpRel node);
    void caseACompTermoRel(ACompTermoRel node);
    void caseAFatorRelTermoRel(AFatorRelTermoRel node);
    void caseAParenFatorRel(AParenFatorRel node);
    void caseANaoparenFatorRel(ANaoparenFatorRel node);
    void caseAValorFatorRel(AValorFatorRel node);
    void caseAVariavelFatorRel(AVariavelFatorRel node);
    void caseAParen(AParen node);

    void caseTCommentLine(TCommentLine node);
    void caseTComentBloco(TComentBloco node);
    void caseTUnderscore(TUnderscore node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTNao(TNao node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTDivisao(TDivisao node);
    void caseTMult(TMult node);
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
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTString(TString node);
    void caseTConst(TConst node);
    void caseTIdentificador(TIdentificador node);
    void caseTCharIgnored(TCharIgnored node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
