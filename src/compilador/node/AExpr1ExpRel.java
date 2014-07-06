/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpr1ExpRel extends PExpRel
{
    private PFatorRel _fatorRel_;
    private POpRelacionalIgual _opRelacionalIgual_;
    private PTermoRel _termoRel_;

    public AExpr1ExpRel()
    {
        // Constructor
    }

    public AExpr1ExpRel(
        @SuppressWarnings("hiding") PFatorRel _fatorRel_,
        @SuppressWarnings("hiding") POpRelacionalIgual _opRelacionalIgual_,
        @SuppressWarnings("hiding") PTermoRel _termoRel_)
    {
        // Constructor
        setFatorRel(_fatorRel_);

        setOpRelacionalIgual(_opRelacionalIgual_);

        setTermoRel(_termoRel_);

    }

    @Override
    public Object clone()
    {
        return new AExpr1ExpRel(
            cloneNode(this._fatorRel_),
            cloneNode(this._opRelacionalIgual_),
            cloneNode(this._termoRel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpr1ExpRel(this);
    }

    public PFatorRel getFatorRel()
    {
        return this._fatorRel_;
    }

    public void setFatorRel(PFatorRel node)
    {
        if(this._fatorRel_ != null)
        {
            this._fatorRel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorRel_ = node;
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

    public PTermoRel getTermoRel()
    {
        return this._termoRel_;
    }

    public void setTermoRel(PTermoRel node)
    {
        if(this._termoRel_ != null)
        {
            this._termoRel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoRel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorRel_)
            + toString(this._opRelacionalIgual_)
            + toString(this._termoRel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorRel_ == child)
        {
            this._fatorRel_ = null;
            return;
        }

        if(this._opRelacionalIgual_ == child)
        {
            this._opRelacionalIgual_ = null;
            return;
        }

        if(this._termoRel_ == child)
        {
            this._termoRel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorRel_ == oldChild)
        {
            setFatorRel((PFatorRel) newChild);
            return;
        }

        if(this._opRelacionalIgual_ == oldChild)
        {
            setOpRelacionalIgual((POpRelacionalIgual) newChild);
            return;
        }

        if(this._termoRel_ == oldChild)
        {
            setTermoRel((PTermoRel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
