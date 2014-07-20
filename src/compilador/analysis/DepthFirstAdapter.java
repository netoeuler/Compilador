/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPStart().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStart(AStart node)
    {
        defaultIn(node);
    }

    public void outAStart(AStart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        inAStart(node);
        if(node.getEsqueletoPrograma() != null)
        {
            node.getEsqueletoPrograma().apply(this);
        }
        outAStart(node);
    }

    public void inAEsqueletoPrograma(AEsqueletoPrograma node)
    {
        defaultIn(node);
    }

    public void outAEsqueletoPrograma(AEsqueletoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEsqueletoPrograma(AEsqueletoPrograma node)
    {
        inAEsqueletoPrograma(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        {
            List<PParteDeclaracao> copy = new ArrayList<PParteDeclaracao>(node.getParteDeclaracao());
            for(PParteDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAEsqueletoPrograma(node);
    }

    public void inADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoVariavelParteDeclaracao(ADeclaracaoVariavelParteDeclaracao node)
    {
        inADeclaracaoVariavelParteDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getIdVirgula() != null)
        {
            node.getIdVirgula().apply(this);
        }
        outADeclaracaoVariavelParteDeclaracao(node);
    }

    public void inADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoConstanteParteDeclaracao(ADeclaracaoConstanteParteDeclaracao node)
    {
        inADeclaracaoConstanteParteDeclaracao(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outADeclaracaoConstanteParteDeclaracao(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inACaractereTipo(ACaractereTipo node)
    {
        defaultIn(node);
    }

    public void outACaractereTipo(ACaractereTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        inACaractereTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACaractereTipo(node);
    }

    public void inAAtribuicaoComandos(AAtribuicaoComandos node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComandos(AAtribuicaoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComandos(AAtribuicaoComandos node)
    {
        inAAtribuicaoComandos(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAAtribuicaoComandos(node);
    }

    public void inALeiaComandos(ALeiaComandos node)
    {
        defaultIn(node);
    }

    public void outALeiaComandos(ALeiaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComandos(ALeiaComandos node)
    {
        inALeiaComandos(node);
        if(node.getIdVirgula() != null)
        {
            node.getIdVirgula().apply(this);
        }
        outALeiaComandos(node);
    }

    public void inAEscrevaComandos(AEscrevaComandos node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComandos(AEscrevaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComandos(AEscrevaComandos node)
    {
        inAEscrevaComandos(node);
        if(node.getEscreva() != null)
        {
            node.getEscreva().apply(this);
        }
        if(node.getAbreParen() != null)
        {
            node.getAbreParen().apply(this);
        }
        if(node.getExpVirgula() != null)
        {
            node.getExpVirgula().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getFechaParen() != null)
        {
            node.getFechaParen().apply(this);
        }
        if(node.getPontoEVirgula() != null)
        {
            node.getPontoEVirgula().apply(this);
        }
        outAEscrevaComandos(node);
    }

    public void inACondicionalComandos(ACondicionalComandos node)
    {
        defaultIn(node);
    }

    public void outACondicionalComandos(ACondicionalComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicionalComandos(ACondicionalComandos node)
    {
        inACondicionalComandos(node);
        if(node.getCondicional() != null)
        {
            node.getCondicional().apply(this);
        }
        outACondicionalComandos(node);
    }

    public void inAAvalieComandos(AAvalieComandos node)
    {
        defaultIn(node);
    }

    public void outAAvalieComandos(AAvalieComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComandos(AAvalieComandos node)
    {
        inAAvalieComandos(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAAvalieComandos(node);
    }

    public void inARepeticaoComandos(ARepeticaoComandos node)
    {
        defaultIn(node);
    }

    public void outARepeticaoComandos(ARepeticaoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepeticaoComandos(ARepeticaoComandos node)
    {
        inARepeticaoComandos(node);
        if(node.getRepeticao() != null)
        {
            node.getRepeticao().apply(this);
        }
        outARepeticaoComandos(node);
    }

    public void inAIdIdVirgula(AIdIdVirgula node)
    {
        defaultIn(node);
    }

    public void outAIdIdVirgula(AIdIdVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdIdVirgula(AIdIdVirgula node)
    {
        inAIdIdVirgula(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAIdIdVirgula(node);
    }

    public void inAIdvirgulaIdVirgula(AIdvirgulaIdVirgula node)
    {
        defaultIn(node);
    }

    public void outAIdvirgulaIdVirgula(AIdvirgulaIdVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdvirgulaIdVirgula(AIdvirgulaIdVirgula node)
    {
        inAIdvirgulaIdVirgula(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getIdVirgula() != null)
        {
            node.getIdVirgula().apply(this);
        }
        outAIdvirgulaIdVirgula(node);
    }

    public void inAIdentificadorAtrib1(AIdentificadorAtrib1 node)
    {
        defaultIn(node);
    }

    public void outAIdentificadorAtrib1(AIdentificadorAtrib1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadorAtrib1(AIdentificadorAtrib1 node)
    {
        inAIdentificadorAtrib1(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdentificadorAtrib1(node);
    }

    public void inANumeroInteiroAtrib1(ANumeroInteiroAtrib1 node)
    {
        defaultIn(node);
    }

    public void outANumeroInteiroAtrib1(ANumeroInteiroAtrib1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroInteiroAtrib1(ANumeroInteiroAtrib1 node)
    {
        inANumeroInteiroAtrib1(node);
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        outANumeroInteiroAtrib1(node);
    }

    public void inANumeroRealAtrib1(ANumeroRealAtrib1 node)
    {
        defaultIn(node);
    }

    public void outANumeroRealAtrib1(ANumeroRealAtrib1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroRealAtrib1(ANumeroRealAtrib1 node)
    {
        inANumeroRealAtrib1(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outANumeroRealAtrib1(node);
    }

    public void inAStringAtrib1(AStringAtrib1 node)
    {
        defaultIn(node);
    }

    public void outAStringAtrib1(AStringAtrib1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringAtrib1(AStringAtrib1 node)
    {
        inAStringAtrib1(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringAtrib1(node);
    }

    public void inAExpVirgula(AExpVirgula node)
    {
        defaultIn(node);
    }

    public void outAExpVirgula(AExpVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpVirgula(AExpVirgula node)
    {
        inAExpVirgula(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAExpVirgula(node);
    }

    public void inACondicional(ACondicional node)
    {
        defaultIn(node);
    }

    public void outACondicional(ACondicional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicional(ACondicional node)
    {
        inACondicional(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outACondicional(node);
    }

    public void inACondSenao(ACondSenao node)
    {
        defaultIn(node);
    }

    public void outACondSenao(ACondSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondSenao(ACondSenao node)
    {
        inACondSenao(node);
        if(node.getCondSenaoSub() != null)
        {
            node.getCondSenaoSub().apply(this);
        }
        outACondSenao(node);
    }

    public void inACondSenaoSub(ACondSenaoSub node)
    {
        defaultIn(node);
    }

    public void outACondSenaoSub(ACondSenaoSub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondSenaoSub(ACondSenaoSub node)
    {
        inACondSenaoSub(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outACondSenaoSub(node);
    }

    public void inAEnquantoRepeticao(AEnquantoRepeticao node)
    {
        defaultIn(node);
    }

    public void outAEnquantoRepeticao(AEnquantoRepeticao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoRepeticao(AEnquantoRepeticao node)
    {
        inAEnquantoRepeticao(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoRepeticao(node);
    }

    public void inARepitaRepeticao(ARepitaRepeticao node)
    {
        defaultIn(node);
    }

    public void outARepitaRepeticao(ARepitaRepeticao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaRepeticao(ARepitaRepeticao node)
    {
        inARepitaRepeticao(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outARepitaRepeticao(node);
    }

    public void inAParaRepeticao(AParaRepeticao node)
    {
        defaultIn(node);
    }

    public void outAParaRepeticao(AParaRepeticao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaRepeticao(AParaRepeticao node)
    {
        inAParaRepeticao(node);
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAParaRepeticao(node);
    }

    public void inAParaSub(AParaSub node)
    {
        defaultIn(node);
    }

    public void outAParaSub(AParaSub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaSub(AParaSub node)
    {
        inAParaSub(node);
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        if(node.getParaSubPasso() != null)
        {
            node.getParaSubPasso().apply(this);
        }
        outAParaSub(node);
    }

    public void inAPassoateParaSubPasso(APassoateParaSubPasso node)
    {
        defaultIn(node);
    }

    public void outAPassoateParaSubPasso(APassoateParaSubPasso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPassoateParaSubPasso(APassoateParaSubPasso node)
    {
        inAPassoateParaSubPasso(node);
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        if(node.getParaSubAte() != null)
        {
            node.getParaSubAte().apply(this);
        }
        outAPassoateParaSubPasso(node);
    }

    public void inAAteParaSubPasso(AAteParaSubPasso node)
    {
        defaultIn(node);
    }

    public void outAAteParaSubPasso(AAteParaSubPasso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAteParaSubPasso(AAteParaSubPasso node)
    {
        inAAteParaSubPasso(node);
        if(node.getParaSubAte() != null)
        {
            node.getParaSubAte().apply(this);
        }
        outAAteParaSubPasso(node);
    }

    public void inAParaSubAte(AParaSubAte node)
    {
        defaultIn(node);
    }

    public void outAParaSubAte(AParaSubAte node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaSubAte(AParaSubAte node)
    {
        inAParaSubAte(node);
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        outAParaSubAte(node);
    }

    public void inAAvalieCasoSub(AAvalieCasoSub node)
    {
        defaultIn(node);
    }

    public void outAAvalieCasoSub(AAvalieCasoSub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieCasoSub(AAvalieCasoSub node)
    {
        inAAvalieCasoSub(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieCasoSub(node);
    }

    public void inAAvalieSenao(AAvalieSenao node)
    {
        defaultIn(node);
    }

    public void outAAvalieSenao(AAvalieSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieSenao(AAvalieSenao node)
    {
        inAAvalieSenao(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieSenao(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultIn(node);
    }

    public void outANumeroInteiroValor(ANumeroInteiroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroInteiroValor(ANumeroInteiroValor node)
    {
        inANumeroInteiroValor(node);
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        outANumeroInteiroValor(node);
    }

    public void inANumeroRealValor(ANumeroRealValor node)
    {
        defaultIn(node);
    }

    public void outANumeroRealValor(ANumeroRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        inANumeroRealValor(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outANumeroRealValor(node);
    }

    public void inAIdentificadorVariavel(AIdentificadorVariavel node)
    {
        defaultIn(node);
    }

    public void outAIdentificadorVariavel(AIdentificadorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadorVariavel(AIdentificadorVariavel node)
    {
        inAIdentificadorVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdentificadorVariavel(node);
    }

    public void inAVetorVariavel(AVetorVariavel node)
    {
        defaultIn(node);
    }

    public void outAVetorVariavel(AVetorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        inAVetorVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        outAVetorVariavel(node);
    }

    public void inAIgualOpRelacionalIgual(AIgualOpRelacionalIgual node)
    {
        defaultIn(node);
    }

    public void outAIgualOpRelacionalIgual(AIgualOpRelacionalIgual node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualOpRelacionalIgual(AIgualOpRelacionalIgual node)
    {
        inAIgualOpRelacionalIgual(node);
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        outAIgualOpRelacionalIgual(node);
    }

    public void inADiferenteOpRelacionalIgual(ADiferenteOpRelacionalIgual node)
    {
        defaultIn(node);
    }

    public void outADiferenteOpRelacionalIgual(ADiferenteOpRelacionalIgual node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteOpRelacionalIgual(ADiferenteOpRelacionalIgual node)
    {
        inADiferenteOpRelacionalIgual(node);
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        outADiferenteOpRelacionalIgual(node);
    }

    public void inAOuOpLogicoOu(AOuOpLogicoOu node)
    {
        defaultIn(node);
    }

    public void outAOuOpLogicoOu(AOuOpLogicoOu node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuOpLogicoOu(AOuOpLogicoOu node)
    {
        inAOuOpLogicoOu(node);
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        outAOuOpLogicoOu(node);
    }

    public void inAXorOpLogicoOu(AXorOpLogicoOu node)
    {
        defaultIn(node);
    }

    public void outAXorOpLogicoOu(AXorOpLogicoOu node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorOpLogicoOu(AXorOpLogicoOu node)
    {
        inAXorOpLogicoOu(node);
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        outAXorOpLogicoOu(node);
    }

    public void inAMenorOpRelacionalComp(AMenorOpRelacionalComp node)
    {
        defaultIn(node);
    }

    public void outAMenorOpRelacionalComp(AMenorOpRelacionalComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorOpRelacionalComp(AMenorOpRelacionalComp node)
    {
        inAMenorOpRelacionalComp(node);
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        outAMenorOpRelacionalComp(node);
    }

    public void inAMenorIgualOpRelacionalComp(AMenorIgualOpRelacionalComp node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualOpRelacionalComp(AMenorIgualOpRelacionalComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualOpRelacionalComp(AMenorIgualOpRelacionalComp node)
    {
        inAMenorIgualOpRelacionalComp(node);
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        outAMenorIgualOpRelacionalComp(node);
    }

    public void inAMaiorOpRelacionalComp(AMaiorOpRelacionalComp node)
    {
        defaultIn(node);
    }

    public void outAMaiorOpRelacionalComp(AMaiorOpRelacionalComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorOpRelacionalComp(AMaiorOpRelacionalComp node)
    {
        inAMaiorOpRelacionalComp(node);
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        outAMaiorOpRelacionalComp(node);
    }

    public void inAMaiorIgualOpRelacionalComp(AMaiorIgualOpRelacionalComp node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualOpRelacionalComp(AMaiorIgualOpRelacionalComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualOpRelacionalComp(AMaiorIgualOpRelacionalComp node)
    {
        inAMaiorIgualOpRelacionalComp(node);
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        outAMaiorIgualOpRelacionalComp(node);
    }

    public void inAMaisExpressao(AMaisExpressao node)
    {
        defaultIn(node);
    }

    public void outAMaisExpressao(AMaisExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExpressao(AMaisExpressao node)
    {
        inAMaisExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outAMaisExpressao(node);
    }

    public void inAMenosExpressao(AMenosExpressao node)
    {
        defaultIn(node);
    }

    public void outAMenosExpressao(AMenosExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpressao(AMenosExpressao node)
    {
        inAMenosExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outAMenosExpressao(node);
    }

    public void inATermoExpressao(ATermoExpressao node)
    {
        defaultIn(node);
    }

    public void outATermoExpressao(ATermoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        inATermoExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoExpressao(node);
    }

    public void inAMultTermo(AMultTermo node)
    {
        defaultIn(node);
    }

    public void outAMultTermo(AMultTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultTermo(AMultTermo node)
    {
        inAMultTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAMultTermo(node);
    }

    public void inADivisaoTermo(ADivisaoTermo node)
    {
        defaultIn(node);
    }

    public void outADivisaoTermo(ADivisaoTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoTermo(ADivisaoTermo node)
    {
        inADivisaoTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outADivisaoTermo(node);
    }

    public void inAFatorTermo(AFatorTermo node)
    {
        defaultIn(node);
    }

    public void outAFatorTermo(AFatorTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        inAFatorTermo(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAFatorTermo(node);
    }

    public void inAParenFator(AParenFator node)
    {
        defaultIn(node);
    }

    public void outAParenFator(AParenFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenFator(AParenFator node)
    {
        inAParenFator(node);
        if(node.getAbreParen() != null)
        {
            node.getAbreParen().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getFechaParen() != null)
        {
            node.getFechaParen().apply(this);
        }
        outAParenFator(node);
    }

    public void inAValorFator(AValorFator node)
    {
        defaultIn(node);
    }

    public void outAValorFator(AValorFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorFator(AValorFator node)
    {
        inAValorFator(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorFator(node);
    }

    public void inAVariavelFator(AVariavelFator node)
    {
        defaultIn(node);
    }

    public void outAVariavelFator(AVariavelFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelFator(AVariavelFator node)
    {
        inAVariavelFator(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelFator(node);
    }

    public void inAOpLogicoExpressaoLogica(AOpLogicoExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAOpLogicoExpressaoLogica(AOpLogicoExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpLogicoExpressaoLogica(AOpLogicoExpressaoLogica node)
    {
        inAOpLogicoExpressaoLogica(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getOpLogicoOu() != null)
        {
            node.getOpLogicoOu().apply(this);
        }
        if(node.getTermoLog() != null)
        {
            node.getTermoLog().apply(this);
        }
        outAOpLogicoExpressaoLogica(node);
    }

    public void inATermoLogExpressaoLogica(ATermoLogExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outATermoLogExpressaoLogica(ATermoLogExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoLogExpressaoLogica(ATermoLogExpressaoLogica node)
    {
        inATermoLogExpressaoLogica(node);
        if(node.getTermoLog() != null)
        {
            node.getTermoLog().apply(this);
        }
        outATermoLogExpressaoLogica(node);
    }

    public void inAETermoLog(AETermoLog node)
    {
        defaultIn(node);
    }

    public void outAETermoLog(AETermoLog node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAETermoLog(AETermoLog node)
    {
        inAETermoLog(node);
        if(node.getTermoLog() != null)
        {
            node.getTermoLog().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getExpRel() != null)
        {
            node.getExpRel().apply(this);
        }
        outAETermoLog(node);
    }

    public void inAExpRelTermoLog(AExpRelTermoLog node)
    {
        defaultIn(node);
    }

    public void outAExpRelTermoLog(AExpRelTermoLog node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpRelTermoLog(AExpRelTermoLog node)
    {
        inAExpRelTermoLog(node);
        if(node.getExpRel() != null)
        {
            node.getExpRel().apply(this);
        }
        outAExpRelTermoLog(node);
    }

    public void inAIgualExpRel(AIgualExpRel node)
    {
        defaultIn(node);
    }

    public void outAIgualExpRel(AIgualExpRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpRel(AIgualExpRel node)
    {
        inAIgualExpRel(node);
        if(node.getFatorRel() != null)
        {
            node.getFatorRel().apply(this);
        }
        if(node.getOpRelacionalIgual() != null)
        {
            node.getOpRelacionalIgual().apply(this);
        }
        if(node.getTermoRel() != null)
        {
            node.getTermoRel().apply(this);
        }
        outAIgualExpRel(node);
    }

    public void inATermoRelExpRel(ATermoRelExpRel node)
    {
        defaultIn(node);
    }

    public void outATermoRelExpRel(ATermoRelExpRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoRelExpRel(ATermoRelExpRel node)
    {
        inATermoRelExpRel(node);
        if(node.getTermoRel() != null)
        {
            node.getTermoRel().apply(this);
        }
        outATermoRelExpRel(node);
    }

    public void inACompTermoRel(ACompTermoRel node)
    {
        defaultIn(node);
    }

    public void outACompTermoRel(ACompTermoRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompTermoRel(ACompTermoRel node)
    {
        inACompTermoRel(node);
        if(node.getTermoRel() != null)
        {
            node.getTermoRel().apply(this);
        }
        if(node.getOpRelacionalComp() != null)
        {
            node.getOpRelacionalComp().apply(this);
        }
        if(node.getFatorRel() != null)
        {
            node.getFatorRel().apply(this);
        }
        outACompTermoRel(node);
    }

    public void inAFatorRelTermoRel(AFatorRelTermoRel node)
    {
        defaultIn(node);
    }

    public void outAFatorRelTermoRel(AFatorRelTermoRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorRelTermoRel(AFatorRelTermoRel node)
    {
        inAFatorRelTermoRel(node);
        if(node.getFatorRel() != null)
        {
            node.getFatorRel().apply(this);
        }
        outAFatorRelTermoRel(node);
    }

    public void inAParenFatorRel(AParenFatorRel node)
    {
        defaultIn(node);
    }

    public void outAParenFatorRel(AParenFatorRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenFatorRel(AParenFatorRel node)
    {
        inAParenFatorRel(node);
        if(node.getParen() != null)
        {
            node.getParen().apply(this);
        }
        outAParenFatorRel(node);
    }

    public void inANaoparenFatorRel(ANaoparenFatorRel node)
    {
        defaultIn(node);
    }

    public void outANaoparenFatorRel(ANaoparenFatorRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoparenFatorRel(ANaoparenFatorRel node)
    {
        inANaoparenFatorRel(node);
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        if(node.getParen() != null)
        {
            node.getParen().apply(this);
        }
        outANaoparenFatorRel(node);
    }

    public void inAValorFatorRel(AValorFatorRel node)
    {
        defaultIn(node);
    }

    public void outAValorFatorRel(AValorFatorRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorFatorRel(AValorFatorRel node)
    {
        inAValorFatorRel(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorFatorRel(node);
    }

    public void inAVariavelFatorRel(AVariavelFatorRel node)
    {
        defaultIn(node);
    }

    public void outAVariavelFatorRel(AVariavelFatorRel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelFatorRel(AVariavelFatorRel node)
    {
        inAVariavelFatorRel(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelFatorRel(node);
    }

    public void inAParen(AParen node)
    {
        defaultIn(node);
    }

    public void outAParen(AParen node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParen(AParen node)
    {
        inAParen(node);
        if(node.getAbreParen() != null)
        {
            node.getAbreParen().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getFechaParen() != null)
        {
            node.getFechaParen().apply(this);
        }
        outAParen(node);
    }
}
