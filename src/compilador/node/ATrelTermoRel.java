/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATrelTermoRel extends PTermoRel
{
    private PTermoRel _termoRel_;
    private PSoma _soma_;
    private PTermo2 _termo2_;

    public ATrelTermoRel()
    {
        // Constructor
    }

    public ATrelTermoRel(
        @SuppressWarnings("hiding") PTermoRel _termoRel_,
        @SuppressWarnings("hiding") PSoma _soma_,
        @SuppressWarnings("hiding") PTermo2 _termo2_)
    {
        // Constructor
        setTermoRel(_termoRel_);

        setSoma(_soma_);

        setTermo2(_termo2_);

    }

    @Override
    public Object clone()
    {
        return new ATrelTermoRel(
            cloneNode(this._termoRel_),
            cloneNode(this._soma_),
            cloneNode(this._termo2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATrelTermoRel(this);
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

    public PSoma getSoma()
    {
        return this._soma_;
    }

    public void setSoma(PSoma node)
    {
        if(this._soma_ != null)
        {
            this._soma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._soma_ = node;
    }

    public PTermo2 getTermo2()
    {
        return this._termo2_;
    }

    public void setTermo2(PTermo2 node)
    {
        if(this._termo2_ != null)
        {
            this._termo2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoRel_)
            + toString(this._soma_)
            + toString(this._termo2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoRel_ == child)
        {
            this._termoRel_ = null;
            return;
        }

        if(this._soma_ == child)
        {
            this._soma_ = null;
            return;
        }

        if(this._termo2_ == child)
        {
            this._termo2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoRel_ == oldChild)
        {
            setTermoRel((PTermoRel) newChild);
            return;
        }

        if(this._soma_ == oldChild)
        {
            setSoma((PSoma) newChild);
            return;
        }

        if(this._termo2_ == oldChild)
        {
            setTermo2((PTermo2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}