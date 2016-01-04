/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExprAndLogicalExprExpr extends PExpr
{
    private PExpr _expr_;
    private TOr _or_;
    private PLogicalExpr _logicalExpr_;

    public AExprAndLogicalExprExpr()
    {
        // Constructor
    }

    public AExprAndLogicalExprExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PLogicalExpr _logicalExpr_)
    {
        // Constructor
        setExpr(_expr_);

        setOr(_or_);

        setLogicalExpr(_logicalExpr_);

    }

    @Override
    public Object clone()
    {
        return new AExprAndLogicalExprExpr(
            cloneNode(this._expr_),
            cloneNode(this._or_),
            cloneNode(this._logicalExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprAndLogicalExprExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    public PLogicalExpr getLogicalExpr()
    {
        return this._logicalExpr_;
    }

    public void setLogicalExpr(PLogicalExpr node)
    {
        if(this._logicalExpr_ != null)
        {
            this._logicalExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._or_)
            + toString(this._logicalExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        if(this._logicalExpr_ == child)
        {
            this._logicalExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._logicalExpr_ == oldChild)
        {
            setLogicalExpr((PLogicalExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}