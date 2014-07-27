/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ACondSenao extends PCondSenao
{
    private final LinkedList<PComandos> _comandos_ = new LinkedList<PComandos>();

    public ACondSenao()
    {
        // Constructor
    }

    public ACondSenao(
        @SuppressWarnings("hiding") List<?> _comandos_)
    {
        // Constructor
        setComandos(_comandos_);

    }

    @Override
    public Object clone()
    {
        return new ACondSenao(
            cloneList(this._comandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondSenao(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandos_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
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

        throw new RuntimeException("Not a child.");
    }
}
