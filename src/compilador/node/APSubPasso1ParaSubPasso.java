/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APSubPasso1ParaSubPasso extends PParaSubPasso
{
    private TPasso _passo_;
    private TNumeroInteiro _numeroInteiro_;
    private PParaSubAte _paraSubAte_;

    public APSubPasso1ParaSubPasso()
    {
        // Constructor
    }

    public APSubPasso1ParaSubPasso(
        @SuppressWarnings("hiding") TPasso _passo_,
        @SuppressWarnings("hiding") TNumeroInteiro _numeroInteiro_,
        @SuppressWarnings("hiding") PParaSubAte _paraSubAte_)
    {
        // Constructor
        setPasso(_passo_);

        setNumeroInteiro(_numeroInteiro_);

        setParaSubAte(_paraSubAte_);

    }

    @Override
    public Object clone()
    {
        return new APSubPasso1ParaSubPasso(
            cloneNode(this._passo_),
            cloneNode(this._numeroInteiro_),
            cloneNode(this._paraSubAte_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPSubPasso1ParaSubPasso(this);
    }

    public TPasso getPasso()
    {
        return this._passo_;
    }

    public void setPasso(TPasso node)
    {
        if(this._passo_ != null)
        {
            this._passo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._passo_ = node;
    }

    public TNumeroInteiro getNumeroInteiro()
    {
        return this._numeroInteiro_;
    }

    public void setNumeroInteiro(TNumeroInteiro node)
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

    public PParaSubAte getParaSubAte()
    {
        return this._paraSubAte_;
    }

    public void setParaSubAte(PParaSubAte node)
    {
        if(this._paraSubAte_ != null)
        {
            this._paraSubAte_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paraSubAte_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._passo_)
            + toString(this._numeroInteiro_)
            + toString(this._paraSubAte_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._passo_ == child)
        {
            this._passo_ = null;
            return;
        }

        if(this._numeroInteiro_ == child)
        {
            this._numeroInteiro_ = null;
            return;
        }

        if(this._paraSubAte_ == child)
        {
            this._paraSubAte_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._passo_ == oldChild)
        {
            setPasso((TPasso) newChild);
            return;
        }

        if(this._numeroInteiro_ == oldChild)
        {
            setNumeroInteiro((TNumeroInteiro) newChild);
            return;
        }

        if(this._paraSubAte_ == oldChild)
        {
            setParaSubAte((PParaSubAte) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
