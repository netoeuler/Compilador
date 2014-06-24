/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APFracParteFrac extends PParteFrac
{
    private TPonto _ponto_;
    private final LinkedList<PNumeroInteiro> _numeroInteiro_ = new LinkedList<PNumeroInteiro>();

    public APFracParteFrac()
    {
        // Constructor
    }

    public APFracParteFrac(
        @SuppressWarnings("hiding") TPonto _ponto_,
        @SuppressWarnings("hiding") List<?> _numeroInteiro_)
    {
        // Constructor
        setPonto(_ponto_);

        setNumeroInteiro(_numeroInteiro_);

    }

    @Override
    public Object clone()
    {
        return new APFracParteFrac(
            cloneNode(this._ponto_),
            cloneList(this._numeroInteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPFracParteFrac(this);
    }

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    public LinkedList<PNumeroInteiro> getNumeroInteiro()
    {
        return this._numeroInteiro_;
    }

    public void setNumeroInteiro(List<?> list)
    {
        for(PNumeroInteiro e : this._numeroInteiro_)
        {
            e.parent(null);
        }
        this._numeroInteiro_.clear();

        for(Object obj_e : list)
        {
            PNumeroInteiro e = (PNumeroInteiro) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._numeroInteiro_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ponto_)
            + toString(this._numeroInteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

        if(this._numeroInteiro_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        for(ListIterator<PNumeroInteiro> i = this._numeroInteiro_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PNumeroInteiro) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}