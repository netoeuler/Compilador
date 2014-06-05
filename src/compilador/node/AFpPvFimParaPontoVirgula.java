/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AFpPvFimParaPontoVirgula extends PFimParaPontoVirgula
{
    private TFimPara _fimPara_;
    private TPontoEVirgula _pontoEVirgula_;

    public AFpPvFimParaPontoVirgula()
    {
        // Constructor
    }

    public AFpPvFimParaPontoVirgula(
        @SuppressWarnings("hiding") TFimPara _fimPara_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_)
    {
        // Constructor
        setFimPara(_fimPara_);

        setPontoEVirgula(_pontoEVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AFpPvFimParaPontoVirgula(
            cloneNode(this._fimPara_),
            cloneNode(this._pontoEVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFpPvFimParaPontoVirgula(this);
    }

    public TFimPara getFimPara()
    {
        return this._fimPara_;
    }

    public void setFimPara(TFimPara node)
    {
        if(this._fimPara_ != null)
        {
            this._fimPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimPara_ = node;
    }

    public TPontoEVirgula getPontoEVirgula()
    {
        return this._pontoEVirgula_;
    }

    public void setPontoEVirgula(TPontoEVirgula node)
    {
        if(this._pontoEVirgula_ != null)
        {
            this._pontoEVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoEVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fimPara_)
            + toString(this._pontoEVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fimPara_ == child)
        {
            this._fimPara_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fimPara_ == oldChild)
        {
            setFimPara((TFimPara) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
