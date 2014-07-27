/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ACondicional extends PCondicional
{
    private PExpressaoLogica _expressaoLogica_;
    private final LinkedList<PComandos> _comandos_ = new LinkedList<PComandos>();
    private PCondSenao _condSenao_;

    public ACondicional()
    {
        // Constructor
    }

    public ACondicional(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") List<?> _comandos_,
        @SuppressWarnings("hiding") PCondSenao _condSenao_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

        setComandos(_comandos_);

        setCondSenao(_condSenao_);

    }

    @Override
    public Object clone()
    {
        return new ACondicional(
            cloneNode(this._expressaoLogica_),
            cloneList(this._comandos_),
            cloneNode(this._condSenao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondicional(this);
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public LinkedList<PComandos> getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(List<?> list)
    {
        for(PComandos e : this._comandos_)
        {
            e.parent(null);
        }
        this._comandos_.clear();

        for(Object obj_e : list)
        {
            PComandos e = (PComandos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandos_.add(e);
        }
    }

    public PCondSenao getCondSenao()
    {
        return this._condSenao_;
    }

    public void setCondSenao(PCondSenao node)
    {
        if(this._condSenao_ != null)
        {
            this._condSenao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condSenao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoLogica_)
            + toString(this._comandos_)
            + toString(this._condSenao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._comandos_.remove(child))
        {
            return;
        }

        if(this._condSenao_ == child)
        {
            this._condSenao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        for(ListIterator<PComandos> i = this._comandos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandos) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._condSenao_ == oldChild)
        {
            setCondSenao((PCondSenao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
