/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ARelCompExpressao extends PExpressao
{
    private PExpressao _expressao_;
    private POpRelacionalComp _opRelacionalComp_;
    private PTermo _termo_;

    public ARelCompExpressao()
    {
        // Constructor
    }

    public ARelCompExpressao(
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") POpRelacionalComp _opRelacionalComp_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setExpressao(_expressao_);

        setOpRelacionalComp(_opRelacionalComp_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new ARelCompExpressao(
            cloneNode(this._expressao_),
            cloneNode(this._opRelacionalComp_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelCompExpressao(this);
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    public POpRelacionalComp getOpRelacionalComp()
    {
        return this._opRelacionalComp_;
    }

    public void setOpRelacionalComp(POpRelacionalComp node)
    {
        if(this._opRelacionalComp_ != null)
        {
            this._opRelacionalComp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opRelacionalComp_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressao_)
            + toString(this._opRelacionalComp_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._opRelacionalComp_ == child)
        {
            this._opRelacionalComp_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._opRelacionalComp_ == oldChild)
        {
            setOpRelacionalComp((POpRelacionalComp) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
