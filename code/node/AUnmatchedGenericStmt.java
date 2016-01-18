/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AUnmatchedGenericStmt extends PGenericStmt
{
    private PUnmatched _unmatched_;

    public AUnmatchedGenericStmt()
    {
        // Constructor
    }

    public AUnmatchedGenericStmt(
        @SuppressWarnings("hiding") PUnmatched _unmatched_)
    {
        // Constructor
        setUnmatched(_unmatched_);

    }

    @Override
    public Object clone()
    {
        return new AUnmatchedGenericStmt(
            cloneNode(this._unmatched_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnmatchedGenericStmt(this);
    }

    public PUnmatched getUnmatched()
    {
        return this._unmatched_;
    }

    public void setUnmatched(PUnmatched node)
    {
        if(this._unmatched_ != null)
        {
            this._unmatched_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unmatched_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unmatched_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unmatched_ == child)
        {
            this._unmatched_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unmatched_ == oldChild)
        {
            setUnmatched((PUnmatched) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
