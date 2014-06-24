/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AFt3Fator2 extends PFator2
{
    private PFator3 _fator3_;

    public AFt3Fator2()
    {
        // Constructor
    }

    public AFt3Fator2(
        @SuppressWarnings("hiding") PFator3 _fator3_)
    {
        // Constructor
        setFator3(_fator3_);

    }

    @Override
    public Object clone()
    {
        return new AFt3Fator2(
            cloneNode(this._fator3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFt3Fator2(this);
    }

    public PFator3 getFator3()
    {
        return this._fator3_;
    }

    public void setFator3(PFator3 node)
    {
        if(this._fator3_ != null)
        {
            this._fator3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fator3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fator3_ == child)
        {
            this._fator3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fator3_ == oldChild)
        {
            setFator3((PFator3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
