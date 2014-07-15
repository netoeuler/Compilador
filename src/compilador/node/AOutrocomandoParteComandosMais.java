/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AOutrocomandoParteComandosMais extends PParteComandosMais
{
    private PParteComandosMais _parteComandosMais_;
    private PComandos _comandos_;
    private PParteComandos _parteComandos_;

    public AOutrocomandoParteComandosMais()
    {
        // Constructor
    }

    public AOutrocomandoParteComandosMais(
        @SuppressWarnings("hiding") PParteComandosMais _parteComandosMais_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") PParteComandos _parteComandos_)
    {
        // Constructor
        setParteComandosMais(_parteComandosMais_);

        setComandos(_comandos_);

        setParteComandos(_parteComandos_);

    }

    @Override
    public Object clone()
    {
        return new AOutrocomandoParteComandosMais(
            cloneNode(this._parteComandosMais_),
            cloneNode(this._comandos_),
            cloneNode(this._parteComandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOutrocomandoParteComandosMais(this);
    }

    public PParteComandosMais getParteComandosMais()
    {
        return this._parteComandosMais_;
    }

    public void setParteComandosMais(PParteComandosMais node)
    {
        if(this._parteComandosMais_ != null)
        {
            this._parteComandosMais_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parteComandosMais_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    public PParteComandos getParteComandos()
    {
        return this._parteComandos_;
    }

    public void setParteComandos(PParteComandos node)
    {
        if(this._parteComandos_ != null)
        {
            this._parteComandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parteComandos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parteComandosMais_)
            + toString(this._comandos_)
            + toString(this._parteComandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parteComandosMais_ == child)
        {
            this._parteComandosMais_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._parteComandos_ == child)
        {
            this._parteComandos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parteComandosMais_ == oldChild)
        {
            setParteComandosMais((PParteComandosMais) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._parteComandos_ == oldChild)
        {
            setParteComandos((PParteComandos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}