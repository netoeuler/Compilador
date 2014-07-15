/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParaRepeticao extends PRepeticao
{
    private TPara _para_;
    private TIdentificador _identificador_;
    private TDe _de_;
    private TNumeroInteiro _numeroInteiro_;
    private PParaSub _paraSub_;
    private PParteComandos _parteComandos_;
    private TFimPara _fimPara_;
    private TPontoEVirgula _pontoEVirgula_;

    public AParaRepeticao()
    {
        // Constructor
    }

    public AParaRepeticao(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TDe _de_,
        @SuppressWarnings("hiding") TNumeroInteiro _numeroInteiro_,
        @SuppressWarnings("hiding") PParaSub _paraSub_,
        @SuppressWarnings("hiding") PParteComandos _parteComandos_,
        @SuppressWarnings("hiding") TFimPara _fimPara_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_)
    {
        // Constructor
        setPara(_para_);

        setIdentificador(_identificador_);

        setDe(_de_);

        setNumeroInteiro(_numeroInteiro_);

        setParaSub(_paraSub_);

        setParteComandos(_parteComandos_);

        setFimPara(_fimPara_);

        setPontoEVirgula(_pontoEVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AParaRepeticao(
            cloneNode(this._para_),
            cloneNode(this._identificador_),
            cloneNode(this._de_),
            cloneNode(this._numeroInteiro_),
            cloneNode(this._paraSub_),
            cloneNode(this._parteComandos_),
            cloneNode(this._fimPara_),
            cloneNode(this._pontoEVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaRepeticao(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public TDe getDe()
    {
        return this._de_;
    }

    public void setDe(TDe node)
    {
        if(this._de_ != null)
        {
            this._de_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._de_ = node;
    }

    public TNumeroInteiro getNumeroInteiro()
    {
        return this._numeroInteiro_;
    }

    public void setNumeroInteiro(TNumeroInteiro node)
    {
        if(this._numeroInteiro_ != null)
        {
            this._numeroInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroInteiro_ = node;
    }

    public PParaSub getParaSub()
    {
        return this._paraSub_;
    }

    public void setParaSub(PParaSub node)
    {
        if(this._paraSub_ != null)
        {
            this._paraSub_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paraSub_ = node;
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

    public TFimPara getFimPara()
    {
        return this._fimPara_;
    }

    public void setFimPara(TFimPara node)
    {
        if(this._fimPara_ != null)
        {
            this._fimPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimPara_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._identificador_)
            + toString(this._de_)
            + toString(this._numeroInteiro_)
            + toString(this._paraSub_)
            + toString(this._parteComandos_)
            + toString(this._fimPara_)
            + toString(this._pontoEVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._de_ == child)
        {
            this._de_ = null;
            return;
        }

        if(this._numeroInteiro_ == child)
        {
            this._numeroInteiro_ = null;
            return;
        }

        if(this._paraSub_ == child)
        {
            this._paraSub_ = null;
            return;
        }

        if(this._parteComandos_ == child)
        {
            this._parteComandos_ = null;
            return;
        }

        if(this._fimPara_ == child)
        {
            this._fimPara_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._de_ == oldChild)
        {
            setDe((TDe) newChild);
            return;
        }

        if(this._numeroInteiro_ == oldChild)
        {
            setNumeroInteiro((TNumeroInteiro) newChild);
            return;
        }

        if(this._paraSub_ == oldChild)
        {
            setParaSub((PParaSub) newChild);
            return;
        }

        if(this._parteComandos_ == oldChild)
        {
            setParteComandos((PParteComandos) newChild);
            return;
        }

        if(this._fimPara_ == oldChild)
        {
            setFimPara((TFimPara) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
