/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AConstRecurParteDeclaracao extends PParteDeclaracao
{
    private PParteDeclaracao _parteDeclaracao_;
    private TConst _const_;
    private TIdentificador _identificador_;
    private TPontoEVirgula _pontoEVirgula_;

    public AConstRecurParteDeclaracao()
    {
        // Constructor
    }

    public AConstRecurParteDeclaracao(
        @SuppressWarnings("hiding") PParteDeclaracao _parteDeclaracao_,
        @SuppressWarnings("hiding") TConst _const_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_)
    {
        // Constructor
        setParteDeclaracao(_parteDeclaracao_);

        setConst(_const_);

        setIdentificador(_identificador_);

        setPontoEVirgula(_pontoEVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AConstRecurParteDeclaracao(
            cloneNode(this._parteDeclaracao_),
            cloneNode(this._const_),
            cloneNode(this._identificador_),
            cloneNode(this._pontoEVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstRecurParteDeclaracao(this);
    }

    public PParteDeclaracao getParteDeclaracao()
    {
        return this._parteDeclaracao_;
    }

    public void setParteDeclaracao(PParteDeclaracao node)
    {
        if(this._parteDeclaracao_ != null)
        {
            this._parteDeclaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parteDeclaracao_ = node;
    }

    public TConst getConst()
    {
        return this._const_;
    }

    public void setConst(TConst node)
    {
        if(this._const_ != null)
        {
            this._const_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._const_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
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
            + toString(this._parteDeclaracao_)
            + toString(this._const_)
            + toString(this._identificador_)
            + toString(this._pontoEVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parteDeclaracao_ == child)
        {
            this._parteDeclaracao_ = null;
            return;
        }

        if(this._const_ == child)
        {
            this._const_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
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
        if(this._parteDeclaracao_ == oldChild)
        {
            setParteDeclaracao((PParteDeclaracao) newChild);
            return;
        }

        if(this._const_ == oldChild)
        {
            setConst((TConst) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
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
