/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
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
        node.getEOF().apply(this);
        node.getPStart().apply(this);
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
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PParteDeclaracao> copy = new ArrayList<PParteDeclaracao>(node.getParteDeclaracao());
            Collections.reverse(copy);
            for(PParteDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
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
        if(node.getIdVirgula() != null)
        {
            node.getIdVirgula().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
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
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
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
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
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
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        {
            List<PExpVirgula> copy = new ArrayList<PExpVirgula>(node.getExpVirgula());
            Collections.reverse(copy);
            for(PExpVirgula e : copy)
            {
                e.apply(this);
            }
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
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outACondicionalComandos(node);
    }

    public void inACondicionalSenaoComandos(ACondicionalSenaoComandos node)
    {
        defaultIn(node);
    }

    public void outACondicionalSenaoComandos(ACondicionalSenaoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicionalSenaoComandos(ACondicionalSenaoComandos node)
    {
        inACondicionalSenaoComandos(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getSenaoCmd());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getEntaoCmd());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outACondicionalSenaoComandos(node);
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

    public void inAEnquantoComandos(AEnquantoComandos node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComandos(AEnquantoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComandos(AEnquantoComandos node)
    {
        inAEnquantoComandos(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outAEnquantoComandos(node);
    }

    public void inARepitaComandos(ARepitaComandos node)
    {
        defaultIn(node);
    }

    public void outARepitaComandos(ARepitaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComandos(ARepitaComandos node)
    {
        inARepitaComandos(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outARepitaComandos(node);
    }

    public void inAParaComandos(AParaComandos node)
    {
        defaultIn(node);
    }

    public void outAParaComandos(AParaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComandos(AParaComandos node)
    {
        inAParaComandos(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAteNum() != null)
        {
            node.getAteNum().apply(this);
        }
        if(node.getDeNum() != null)
        {
            node.getDeNum().apply(this);
        }
        outAParaComandos(node);
    }

    public void inAParaPassoComandos(AParaPassoComandos node)
    {
        defaultIn(node);
    }

    public void outAParaPassoComandos(AParaPassoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaPassoComandos(AParaPassoComandos node)
    {
        inAParaPassoComandos(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            Collections.reverse(copy);
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAteNum() != null)
        {
            node.getAteNum().apply(this);
        }
        if(node.getPassoNum() != null)
        {
            node.getPassoNum().apply(this);
        }
        if(node.getDeNum() != null)
        {
            node.getDeNum().apply(this);
        }
        outAParaPassoComandos(node);
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
        if(node.getIdVirgula() != null)
        {
            node.getIdVirgula().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAIdvirgulaIdVirgula(node);
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
        outAExpVirgula(node);
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
            Collections.reverse(copy);
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
            Collections.reverse(copy);
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
        if(node.getNumeroInteiro() != null)
        {
            node.getNumeroInteiro().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVetorVariavel(node);
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
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
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
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMenosExpressao(node);
    }

    public void inAMultExpressao(AMultExpressao node)
    {
        defaultIn(node);
    }

    public void outAMultExpressao(AMultExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpressao(AMultExpressao node)
    {
        inAMultExpressao(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMultExpressao(node);
    }

    public void inADivisaoExpressao(ADivisaoExpressao node)
    {
        defaultIn(node);
    }

    public void outADivisaoExpressao(ADivisaoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoExpressao(ADivisaoExpressao node)
    {
        inADivisaoExpressao(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outADivisaoExpressao(node);
    }

    public void inAVariavelExpressao(AVariavelExpressao node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpressao(AVariavelExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpressao(AVariavelExpressao node)
    {
        inAVariavelExpressao(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelExpressao(node);
    }

    public void inAValorExpressao(AValorExpressao node)
    {
        defaultIn(node);
    }

    public void outAValorExpressao(AValorExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExpressao(AValorExpressao node)
    {
        inAValorExpressao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExpressao(node);
    }

    public void inAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        inAOuExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAOuExpressaoLogica(node);
    }

    public void inAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        inAXorExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAXorExpressaoLogica(node);
    }

    public void inAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpressaoLogica(AEExpressaoLogica node)
    {
        inAEExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAEExpressaoLogica(node);
    }

    public void inAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        inAIgualExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAIgualExpressaoLogica(node);
    }

    public void inADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        inADiferenteExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outADiferenteExpressaoLogica(node);
    }

    public void inAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        inAMenorExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMenorExpressaoLogica(node);
    }

    public void inAMenorIgualExpressaoLogica(AMenorIgualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExpressaoLogica(AMenorIgualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExpressaoLogica(AMenorIgualExpressaoLogica node)
    {
        inAMenorIgualExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMenorIgualExpressaoLogica(node);
    }

    public void inAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        inAMaiorExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMaiorExpressaoLogica(node);
    }

    public void inAMaiorIgualExpressaoLogica(AMaiorIgualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExpressaoLogica(AMaiorIgualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExpressaoLogica(AMaiorIgualExpressaoLogica node)
    {
        inAMaiorIgualExpressaoLogica(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMaiorIgualExpressaoLogica(node);
    }
}
