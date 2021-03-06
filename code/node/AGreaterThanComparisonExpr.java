/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AGreaterThanComparisonExpr extends PComparisonExpr
{
    private PArithExpr _plusMinusSrc_;
    private TGreaterThan _greaterThan_;
    private PArithExpr _plusMinusTarget_;

    public AGreaterThanComparisonExpr()
    {
        // Constructor
    }

    public AGreaterThanComparisonExpr(
        @SuppressWarnings("hiding") PArithExpr _plusMinusSrc_,
        @SuppressWarnings("hiding") TGreaterThan _greaterThan_,
        @SuppressWarnings("hiding") PArithExpr _plusMinusTarget_)
    {
        // Constructor
        setPlusMinusSrc(_plusMinusSrc_);

        setGreaterThan(_greaterThan_);

        setPlusMinusTarget(_plusMinusTarget_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterThanComparisonExpr(
            cloneNode(this._plusMinusSrc_),
            cloneNode(this._greaterThan_),
            cloneNode(this._plusMinusTarget_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterThanComparisonExpr(this);
    }

    public PArithExpr getPlusMinusSrc()
    {
        return this._plusMinusSrc_;
    }

    public void setPlusMinusSrc(PArithExpr node)
    {
        if(this._plusMinusSrc_ != null)
        {
            this._plusMinusSrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plusMinusSrc_ = node;
    }

    public TGreaterThan getGreaterThan()
    {
        return this._greaterThan_;
    }

    public void setGreaterThan(TGreaterThan node)
    {
        if(this._greaterThan_ != null)
        {
            this._greaterThan_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greaterThan_ = node;
    }

    public PArithExpr getPlusMinusTarget()
    {
        return this._plusMinusTarget_;
    }

    public void setPlusMinusTarget(PArithExpr node)
    {
        if(this._plusMinusTarget_ != null)
        {
            this._plusMinusTarget_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plusMinusTarget_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._plusMinusSrc_)
            + toString(this._greaterThan_)
            + toString(this._plusMinusTarget_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plusMinusSrc_ == child)
        {
            this._plusMinusSrc_ = null;
            return;
        }

        if(this._greaterThan_ == child)
        {
            this._greaterThan_ = null;
            return;
        }

        if(this._plusMinusTarget_ == child)
        {
            this._plusMinusTarget_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plusMinusSrc_ == oldChild)
        {
            setPlusMinusSrc((PArithExpr) newChild);
            return;
        }

        if(this._greaterThan_ == oldChild)
        {
            setGreaterThan((TGreaterThan) newChild);
            return;
        }

        if(this._plusMinusTarget_ == oldChild)
        {
            setPlusMinusTarget((PArithExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
