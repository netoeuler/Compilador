/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AOpr1OpRelacional extends POpRelacional
{
    private POpRelacionalIgual _opRelacionalIgual_;

    public AOpr1OpRelacional()
    {
        // Constructor
    }

    public AOpr1OpRelacional(
        @SuppressWarnings("hiding") POpRelacionalIgual _opRelacionalIgual_)
    {
        // Constructor
        setOpRelacionalIgual(_opRelacionalIgual_);

    }

    @Override
    public Object clone()
    {
        return new AOpr1OpRelacional(
            cloneNode(this._opRelacionalIgual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpr1OpRelacional(this);
    }

    public POpRelacionalIgual getOpRelacionalIgual()
    {
        return this._opRelacionalIgual_;
    }

    public void setOpRelacionalIgual(POpRelacionalIgual node)
    {
        if(this._opRelacionalIgual_ != null)
        {
            this._opRelacionalIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opRelacionalIgual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opRelacionalIgual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opRelacionalIgual_ == child)
        {
            this._opRelacionalIgual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opRelacionalIgual_ == oldChild)
        {
            setOpRelacionalIgual((POpRelacionalIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}