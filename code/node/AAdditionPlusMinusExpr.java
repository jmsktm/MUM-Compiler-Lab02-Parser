/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAdditionPlusMinusExpr extends PPlusMinusExpr
{
    private PPlusMinusExpr _plusMinusExprSrc_;
    private TPlus _plus_;
    private PMultDivModExpr _multDivModTarget_;

    public AAdditionPlusMinusExpr()
    {
        // Constructor
    }

    public AAdditionPlusMinusExpr(
        @SuppressWarnings("hiding") PPlusMinusExpr _plusMinusExprSrc_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PMultDivModExpr _multDivModTarget_)
    {
        // Constructor
        setPlusMinusExprSrc(_plusMinusExprSrc_);

        setPlus(_plus_);

        setMultDivModTarget(_multDivModTarget_);

    }

    @Override
    public Object clone()
    {
        return new AAdditionPlusMinusExpr(
            cloneNode(this._plusMinusExprSrc_),
            cloneNode(this._plus_),
            cloneNode(this._multDivModTarget_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionPlusMinusExpr(this);
    }

    public PPlusMinusExpr getPlusMinusExprSrc()
    {
        return this._plusMinusExprSrc_;
    }

    public void setPlusMinusExprSrc(PPlusMinusExpr node)
    {
        if(this._plusMinusExprSrc_ != null)
        {
            this._plusMinusExprSrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plusMinusExprSrc_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PMultDivModExpr getMultDivModTarget()
    {
        return this._multDivModTarget_;
    }

    public void setMultDivModTarget(PMultDivModExpr node)
    {
        if(this._multDivModTarget_ != null)
        {
            this._multDivModTarget_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multDivModTarget_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._plusMinusExprSrc_)
            + toString(this._plus_)
            + toString(this._multDivModTarget_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plusMinusExprSrc_ == child)
        {
            this._plusMinusExprSrc_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._multDivModTarget_ == child)
        {
            this._multDivModTarget_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plusMinusExprSrc_ == oldChild)
        {
            setPlusMinusExprSrc((PPlusMinusExpr) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._multDivModTarget_ == oldChild)
        {
            setMultDivModTarget((PMultDivModExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
