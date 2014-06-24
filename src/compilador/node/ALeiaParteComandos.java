/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaParteComandos extends PParteComandos
{
    private TLeia _leia_;
    private TAbreParen _abreParen_;
    private PIdVirgula _idVirgula_;
    private TIdentificador _identificador_;
    private TFechaParen _fechaParen_;
    private TPontoEVirgula _pontoEVirgula_;

    public ALeiaParteComandos()
    {
        // Constructor
    }

    public ALeiaParteComandos(
        @SuppressWarnings("hiding") TLeia _leia_,
        @SuppressWarnings("hiding") TAbreParen _abreParen_,
        @SuppressWarnings("hiding") PIdVirgula _idVirgula_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TFechaParen _fechaParen_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_)
    {
        // Constructor
        setLeia(_leia_);

        setAbreParen(_abreParen_);

        setIdVirgula(_idVirgula_);

        setIdentificador(_identificador_);

        setFechaParen(_fechaParen_);

        setPontoEVirgula(_pontoEVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaParteComandos(
            cloneNode(this._leia_),
            cloneNode(this._abreParen_),
            cloneNode(this._idVirgula_),
            cloneNode(this._identificador_),
            cloneNode(this._fechaParen_),
            cloneNode(this._pontoEVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaParteComandos(this);
    }

    public TLeia getLeia()
    {
        return this._leia_;
    }

    public void setLeia(TLeia node)
    {
        if(this._leia_ != null)
        {
            this._leia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leia_ = node;
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

    public PIdVirgula getIdVirgula()
    {
        return this._idVirgula_;
    }

    public void setIdVirgula(PIdVirgula node)
    {
        if(this._idVirgula_ != null)
        {
            this._idVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idVirgula_ = node;
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
            + toString(this._leia_)
            + toString(this._abreParen_)
            + toString(this._idVirgula_)
            + toString(this._identificador_)
            + toString(this._fechaParen_)
            + toString(this._pontoEVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leia_ == child)
        {
            this._leia_ = null;
            return;
        }

        if(this._abreParen_ == child)
        {
            this._abreParen_ = null;
            return;
        }

        if(this._idVirgula_ == child)
        {
            this._idVirgula_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._fechaParen_ == child)
        {
            this._fechaParen_ = null;
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
        if(this._leia_ == oldChild)
        {
            setLeia((TLeia) newChild);
            return;
        }

        if(this._abreParen_ == oldChild)
        {
            setAbreParen((TAbreParen) newChild);
            return;
        }

        if(this._idVirgula_ == oldChild)
        {
            setIdVirgula((PIdVirgula) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._fechaParen_ == oldChild)
        {
            setFechaParen((TFechaParen) newChild);
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
