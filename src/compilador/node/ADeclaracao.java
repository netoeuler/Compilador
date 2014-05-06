/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracao extends PDeclaracao
{
    private TTipo _tipo_;
    private TDoispontos _doispontos_;
    private TVar _var_;
    private TCharmin _charmin_;
    private TEol _eol_;

    public ADeclaracao()
    {
        // Constructor
    }

    public ADeclaracao(
        @SuppressWarnings("hiding") TTipo _tipo_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") TVar _var_,
        @SuppressWarnings("hiding") TCharmin _charmin_,
        @SuppressWarnings("hiding") TEol _eol_)
    {
        // Constructor
        setTipo(_tipo_);

        setDoispontos(_doispontos_);

        setVar(_var_);

        setCharmin(_charmin_);

        setEol(_eol_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracao(
            cloneNode(this._tipo_),
            cloneNode(this._doispontos_),
            cloneNode(this._var_),
            cloneNode(this._charmin_),
            cloneNode(this._eol_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracao(this);
    }

    public TTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(TTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
    }

    public TVar getVar()
    {
        return this._var_;
    }

    public void setVar(TVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TCharmin getCharmin()
    {
        return this._charmin_;
    }

    public void setCharmin(TCharmin node)
    {
        if(this._charmin_ != null)
        {
            this._charmin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._charmin_ = node;
    }

    public TEol getEol()
    {
        return this._eol_;
    }

    public void setEol(TEol node)
    {
        if(this._eol_ != null)
        {
            this._eol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._doispontos_)
            + toString(this._var_)
            + toString(this._charmin_)
            + toString(this._eol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._charmin_ == child)
        {
            this._charmin_ = null;
            return;
        }

        if(this._eol_ == child)
        {
            this._eol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((TTipo) newChild);
            return;
        }

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((TVar) newChild);
            return;
        }

        if(this._charmin_ == oldChild)
        {
            setCharmin((TCharmin) newChild);
            return;
        }

        if(this._eol_ == oldChild)
        {
            setEol((TEol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}