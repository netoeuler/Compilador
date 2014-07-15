/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVetorVariavel extends PVariavel
{
    private TIdentificador _identificador_;
    private TAbreColchete _abreColchete_;
    private TNumeroInteiro _numeroInteiro_;
    private TFechaColchete _fechaColchete_;

    public AVetorVariavel()
    {
        // Constructor
    }

    public AVetorVariavel(
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TAbreColchete _abreColchete_,
        @SuppressWarnings("hiding") TNumeroInteiro _numeroInteiro_,
        @SuppressWarnings("hiding") TFechaColchete _fechaColchete_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setAbreColchete(_abreColchete_);

        setNumeroInteiro(_numeroInteiro_);

        setFechaColchete(_fechaColchete_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVariavel(
            cloneNode(this._identificador_),
            cloneNode(this._abreColchete_),
            cloneNode(this._numeroInteiro_),
            cloneNode(this._fechaColchete_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVariavel(this);
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

    public TAbreColchete getAbreColchete()
    {
        return this._abreColchete_;
    }

    public void setAbreColchete(TAbreColchete node)
    {
        if(this._abreColchete_ != null)
        {
            this._abreColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreColchete_ = node;
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

    public TFechaColchete getFechaColchete()
    {
        return this._fechaColchete_;
    }

    public void setFechaColchete(TFechaColchete node)
    {
        if(this._fechaColchete_ != null)
        {
            this._fechaColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaColchete_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._abreColchete_)
            + toString(this._numeroInteiro_)
            + toString(this._fechaColchete_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._abreColchete_ == child)
        {
            this._abreColchete_ = null;
            return;
        }

        if(this._numeroInteiro_ == child)
        {
            this._numeroInteiro_ = null;
            return;
        }

        if(this._fechaColchete_ == child)
        {
            this._fechaColchete_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._abreColchete_ == oldChild)
        {
            setAbreColchete((TAbreColchete) newChild);
            return;
        }

        if(this._numeroInteiro_ == oldChild)
        {
            setNumeroInteiro((TNumeroInteiro) newChild);
            return;
        }

        if(this._fechaColchete_ == oldChild)
        {
            setFechaColchete((TFechaColchete) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}