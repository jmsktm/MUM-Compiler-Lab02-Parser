/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotAFactExpr extends PFactExpr
{
    private PUnaryExpr _unaryExpr_;

    public ANotAFactExpr()
    {
        // Constructor
    }

    public ANotAFactExpr(
        @SuppressWarnings("hiding") PUnaryExpr _unaryExpr_)
    {
        // Constructor
        setUnaryExpr(_unaryExpr_);

    }

    @Override
    public Object clone()
    {
        return new ANotAFactExpr(
            cloneNode(this._unaryExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotAFactExpr(this);
    }

    public PUnaryExpr getUnaryExpr()
    {
        return this._unaryExpr_;
    }

    public void setUnaryExpr(PUnaryExpr node)
    {
        if(this._unaryExpr_ != null)
        {
            this._unaryExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unaryExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unaryExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unaryExpr_ == child)
        {
            this._unaryExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unaryExpr_ == oldChild)
        {
            setUnaryExpr((PUnaryExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
