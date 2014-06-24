/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpl1ExpressaoLogica extends PExpressaoLogica
{
    private TNao _nao_;
    private PTermoLog _termoLog_;

    public AExpl1ExpressaoLogica()
    {
        // Constructor
    }

    public AExpl1ExpressaoLogica(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PTermoLog _termoLog_)
    {
        // Constructor
        setNao(_nao_);

        setTermoLog(_termoLog_);

    }

    @Override
    public Object clone()
    {
        return new AExpl1ExpressaoLogica(
            cloneNode(this._nao_),
            cloneNode(this._termoLog_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpl1ExpressaoLogica(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._nao_)
            + toString(this._termoLog_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
            return;
        }

        if(this._termoLog_ == child)
        {
            this._termoLog_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
            return;
        }

        if(this._termoLog_ == oldChild)
        {
            setTermoLog((PTermoLog) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}