/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoVariavelParteDeclaracao extends PParteDeclaracao
{
    private PTipo _tipo_;
    private PIdVirgula _idVirgula_;

    public ADeclaracaoVariavelParteDeclaracao()
    {
        // Constructor
    }

    public ADeclaracaoVariavelParteDeclaracao(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") PIdVirgula _idVirgula_)
    {
        // Constructor
        setTipo(_tipo_);

        setIdVirgula(_idVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoVariavelParteDeclaracao(
            cloneNode(this._tipo_),
            cloneNode(this._idVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoVariavelParteDeclaracao(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._idVirgula_);
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

        if(this._idVirgula_ == child)
        {
            this._idVirgula_ = null;
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
            setTipo((PTipo) newChild);
            return;
        }

        if(this._idVirgula_ == oldChild)
        {
            setIdVirgula((PIdVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}