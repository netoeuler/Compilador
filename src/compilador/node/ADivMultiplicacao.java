/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADivMultiplicacao extends PMultiplicacao
{
    private TDivisao _divisao_;

    public ADivMultiplicacao()
    {
        // Constructor
    }

    public ADivMultiplicacao(
        @SuppressWarnings("hiding") TDivisao _divisao_)
    {
        // Constructor
        setDivisao(_divisao_);

    }

    @Override
    public Object clone()
    {
        return new ADivMultiplicacao(
            cloneNode(this._divisao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivMultiplicacao(this);
    }

    public TDivisao getDivisao()
    {
        return this._divisao_;
    }

    public void setDivisao(TDivisao node)
    {
        if(this._divisao_ != null)
        {
            this._divisao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._divisao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._divisao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._divisao_ == child)
        {
            this._divisao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._divisao_ == oldChild)
        {
            setDivisao((TDivisao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
