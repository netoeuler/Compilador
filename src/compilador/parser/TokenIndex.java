/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.parser;

import compilador.node.*;
import compilador.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTComentBloco(@SuppressWarnings("unused") TComentBloco node)
    {
        this.index = 0;
    }

    @Override
    public void caseTNumeroInteiro(@SuppressWarnings("unused") TNumeroInteiro node)
    {
        this.index = 1;
    }

    @Override
    public void caseTNumeroReal(@SuppressWarnings("unused") TNumeroReal node)
    {
        this.index = 2;
    }

    @Override
    public void caseTNumero(@SuppressWarnings("unused") TNumero node)
    {
        this.index = 3;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 5;
    }

    @Override
    public void caseTDivisao(@SuppressWarnings("unused") TDivisao node)
    {
        this.index = 6;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 7;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 8;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 9;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 11;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 12;
    }

    @Override
    public void caseTSeta(@SuppressWarnings("unused") TSeta node)
    {
        this.index = 13;
    }

    @Override
    public void caseTIgualIgual(@SuppressWarnings("unused") TIgualIgual node)
    {
        this.index = 14;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 15;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 16;
    }

    @Override
    public void caseTPontoEVirgula(@SuppressWarnings("unused") TPontoEVirgula node)
    {
        this.index = 17;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 18;
    }

    @Override
    public void caseTAbreParen(@SuppressWarnings("unused") TAbreParen node)
    {
        this.index = 19;
    }

    @Override
    public void caseTFechaParen(@SuppressWarnings("unused") TFechaParen node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAbreColchete(@SuppressWarnings("unused") TAbreColchete node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFechaColchete(@SuppressWarnings("unused") TFechaColchete node)
    {
        this.index = 22;
    }

    @Override
    public void caseTAbreChave(@SuppressWarnings("unused") TAbreChave node)
    {
        this.index = 23;
    }

    @Override
    public void caseTFechaChave(@SuppressWarnings("unused") TFechaChave node)
    {
        this.index = 24;
    }

    @Override
    public void caseTAbreComent(@SuppressWarnings("unused") TAbreComent node)
    {
        this.index = 25;
    }

    @Override
    public void caseTFechaComent(@SuppressWarnings("unused") TFechaComent node)
    {
        this.index = 26;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 27;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 28;
    }

    @Override
    public void caseTLeia(@SuppressWarnings("unused") TLeia node)
    {
        this.index = 29;
    }

    @Override
    public void caseTEscreva(@SuppressWarnings("unused") TEscreva node)
    {
        this.index = 30;
    }

    @Override
    public void caseTPrograma(@SuppressWarnings("unused") TPrograma node)
    {
        this.index = 31;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 32;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 33;
    }

    @Override
    public void caseTEntao(@SuppressWarnings("unused") TEntao node)
    {
        this.index = 34;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 35;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 36;
    }

    @Override
    public void caseTFaca(@SuppressWarnings("unused") TFaca node)
    {
        this.index = 37;
    }

    @Override
    public void caseTRepita(@SuppressWarnings("unused") TRepita node)
    {
        this.index = 38;
    }

    @Override
    public void caseTAte(@SuppressWarnings("unused") TAte node)
    {
        this.index = 39;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 40;
    }

    @Override
    public void caseTDe(@SuppressWarnings("unused") TDe node)
    {
        this.index = 41;
    }

    @Override
    public void caseTPasso(@SuppressWarnings("unused") TPasso node)
    {
        this.index = 42;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 43;
    }

    @Override
    public void caseTFimPonto(@SuppressWarnings("unused") TFimPonto node)
    {
        this.index = 44;
    }

    @Override
    public void caseTFimSe(@SuppressWarnings("unused") TFimSe node)
    {
        this.index = 45;
    }

    @Override
    public void caseTFimEnquanto(@SuppressWarnings("unused") TFimEnquanto node)
    {
        this.index = 46;
    }

    @Override
    public void caseTFimPara(@SuppressWarnings("unused") TFimPara node)
    {
        this.index = 47;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 48;
    }

    @Override
    public void caseTTipo(@SuppressWarnings("unused") TTipo node)
    {
        this.index = 49;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 50;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 51;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 52;
    }

    @Override
    public void caseTNomePrograma(@SuppressWarnings("unused") TNomePrograma node)
    {
        this.index = 53;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 54;
    }

    @Override
    public void caseTValor(@SuppressWarnings("unused") TValor node)
    {
        this.index = 55;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 56;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 57;
    }
}
