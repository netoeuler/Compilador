/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaRepeticao extends PRepeticao
{
    private TRepita _repita_;
    private PCmdPontoVirgula _cmdPontoVirgula_;
    private PParteComandos _parteComandos_;
    private TPontoEVirgula _pontoEVirgula_;
    private TAte _ate_;
    private TAbreParen _abreParen_;
    private PExpressaoLogica _expressaoLogica_;
    private TFechaParen _fechaParen_;

    public ARepitaRepeticao()
    {
        // Constructor
    }

    public ARepitaRepeticao(
        @SuppressWarnings("hiding") TRepita _repita_,
        @SuppressWarnings("hiding") PCmdPontoVirgula _cmdPontoVirgula_,
        @SuppressWarnings("hiding") PParteComandos _parteComandos_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TAbreParen _abreParen_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TFechaParen _fechaParen_)
    {
        // Constructor
        setRepita(_repita_);

        setCmdPontoVirgula(_cmdPontoVirgula_);

        setParteComandos(_parteComandos_);

        setPontoEVirgula(_pontoEVirgula_);

        setAte(_ate_);

        setAbreParen(_abreParen_);

        setExpressaoLogica(_expressaoLogica_);

        setFechaParen(_fechaParen_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaRepeticao(
            cloneNode(this._repita_),
            cloneNode(this._cmdPontoVirgula_),
            cloneNode(this._parteComandos_),
            cloneNode(this._pontoEVirgula_),
            cloneNode(this._ate_),
            cloneNode(this._abreParen_),
            cloneNode(this._expressaoLogica_),
            cloneNode(this._fechaParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaRepeticao(this);
    }

    public TRepita getRepita()
    {
        return this._repita_;
    }

    public void setRepita(TRepita node)
    {
        if(this._repita_ != null)
        {
            this._repita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repita_ = node;
    }

    public PCmdPontoVirgula getCmdPontoVirgula()
    {
        return this._cmdPontoVirgula_;
    }

    public void setCmdPontoVirgula(PCmdPontoVirgula node)
    {
        if(this._cmdPontoVirgula_ != null)
        {
            this._cmdPontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmdPontoVirgula_ = node;
    }

    public PParteComandos getParteComandos()
    {
        return this._parteComandos_;
    }

    public void setParteComandos(PParteComandos node)
    {
        if(this._parteComandos_ != null)
        {
            this._parteComandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parteComandos_ = node;
    }

    public TPontoEVirgula getPontoEVirgula()
    {
        return this._pontoEVirgula_;
    }

    public void setPontoEVirgula(TPontoEVirgula node)
    {
        if(this._pontoEVirgula_ != null)
        {
            this._pontoEVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoEVirgula_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
    }

    public TAbreParen getAbreParen()
    {
        return this._abreParen_;
    }

    public void setAbreParen(TAbreParen node)
    {
        if(this._abreParen_ != null)
        {
            this._abreParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParen_ = node;
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public TFechaParen getFechaParen()
    {
        return this._fechaParen_;
    }

    public void setFechaParen(TFechaParen node)
    {
        if(this._fechaParen_ != null)
        {
            this._fechaParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repita_)
            + toString(this._cmdPontoVirgula_)
            + toString(this._parteComandos_)
            + toString(this._pontoEVirgula_)
            + toString(this._ate_)
            + toString(this._abreParen_)
            + toString(this._expressaoLogica_)
            + toString(this._fechaParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repita_ == child)
        {
            this._repita_ = null;
            return;
        }

        if(this._cmdPontoVirgula_ == child)
        {
            this._cmdPontoVirgula_ = null;
            return;
        }

        if(this._parteComandos_ == child)
        {
            this._parteComandos_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._abreParen_ == child)
        {
            this._abreParen_ = null;
            return;
        }

        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._fechaParen_ == child)
        {
            this._fechaParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repita_ == oldChild)
        {
            setRepita((TRepita) newChild);
            return;
        }

        if(this._cmdPontoVirgula_ == oldChild)
        {
            setCmdPontoVirgula((PCmdPontoVirgula) newChild);
            return;
        }

        if(this._parteComandos_ == oldChild)
        {
            setParteComandos((PParteComandos) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._abreParen_ == oldChild)
        {
            setAbreParen((TAbreParen) newChild);
            return;
        }

        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        if(this._fechaParen_ == oldChild)
        {
            setFechaParen((TFechaParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}