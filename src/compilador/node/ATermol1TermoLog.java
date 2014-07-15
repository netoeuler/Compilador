/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ATermol1TermoLog extends PTermoLog
{
    private PTermoLog _termoLog_;
    private TE _e_;
    private PExpRel _expRel_;

    public ATermol1TermoLog()
    {
        // Constructor
    }

    public ATermol1TermoLog(
        @SuppressWarnings("hiding") PTermoLog _termoLog_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PExpRel _expRel_)
    {
        // Constructor
        setTermoLog(_termoLog_);

        setE(_e_);

        setExpRel(_expRel_);

    }

    @Override
    public Object clone()
    {
        return new ATermol1TermoLog(
            cloneNode(this._termoLog_),
            cloneNode(this._e_),
            cloneNode(this._expRel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermol1TermoLog(this);
    }

    public PTermoLog getTermoLog()
    {
        return this._termoLog_;
    }

    public void setTermoLog(PTermoLog node)
    {
        if(this._termoLog_ != null)
        {
            this._termoLog_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoLog_ = node;
    }

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PExpRel getExpRel()
    {
        return this._expRel_;
    }

    public void setExpRel(PExpRel node)
    {
        if(this._expRel_ != null)
        {
            this._expRel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expRel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoLog_)
            + toString(this._e_)
            + toString(this._expRel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoLog_ == child)
        {
            this._termoLog_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._expRel_ == child)
        {
            this._expRel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoLog_ == oldChild)
        {
            setTermoLog((PTermoLog) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._expRel_ == oldChild)
        {
            setExpRel((PExpRel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}