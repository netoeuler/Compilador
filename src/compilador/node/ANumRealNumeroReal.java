/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ANumRealNumeroReal extends PNumeroReal
{
    private PNumeroInteiro _numeroInteiro_;
    private PParteFrac _parteFrac_;

    public ANumRealNumeroReal()
    {
        // Constructor
    }

    public ANumRealNumeroReal(
        @SuppressWarnings("hiding") PNumeroInteiro _numeroInteiro_,
        @SuppressWarnings("hiding") PParteFrac _parteFrac_)
    {
        // Constructor
        setNumeroInteiro(_numeroInteiro_);

        setParteFrac(_parteFrac_);

    }

    @Override
    public Object clone()
    {
        return new ANumRealNumeroReal(
            cloneNode(this._numeroInteiro_),
            cloneNode(this._parteFrac_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumRealNumeroReal(this);
    }

    public PNumeroInteiro getNumeroInteiro()
    {
        return this._numeroInteiro_;
    }

    public void setNumeroInteiro(PNumeroInteiro node)
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

    public PParteFrac getParteFrac()
    {
        return this._parteFrac_;
    }

    public void setParteFrac(PParteFrac node)
    {
        if(this._parteFrac_ != null)
        {
            this._parteFrac_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parteFrac_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroInteiro_)
            + toString(this._parteFrac_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroInteiro_ == child)
        {
            this._numeroInteiro_ = null;
            return;
        }

        if(this._parteFrac_ == child)
        {
            this._parteFrac_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroInteiro_ == oldChild)
        {
            setNumeroInteiro((PNumeroInteiro) newChild);
            return;
        }

        if(this._parteFrac_ == oldChild)
        {
            setParteFrac((PParteFrac) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
