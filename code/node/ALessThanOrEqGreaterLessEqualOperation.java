/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALessThanOrEqGreaterLessEqualOperation extends PGreaterLessEqualOperation
{
    private PPlusMinusExpr _plusMinusSrc_;
    private TLessThanOrEq _lessThanOrEq_;
    private PPlusMinusExpr _plusMinusTarget_;

    public ALessThanOrEqGreaterLessEqualOperation()
    {
        // Constructor
    }

    public ALessThanOrEqGreaterLessEqualOperation(
        @SuppressWarnings("hiding") PPlusMinusExpr _plusMinusSrc_,
        @SuppressWarnings("hiding") TLessThanOrEq _lessThanOrEq_,
        @SuppressWarnings("hiding") PPlusMinusExpr _plusMinusTarget_)
    {
        // Constructor
        setPlusMinusSrc(_plusMinusSrc_);

        setLessThanOrEq(_lessThanOrEq_);

        setPlusMinusTarget(_plusMinusTarget_);

    }

    @Override
    public Object clone()
    {
        return new ALessThanOrEqGreaterLessEqualOperation(
            cloneNode(this._plusMinusSrc_),
            cloneNode(this._lessThanOrEq_),
            cloneNode(this._plusMinusTarget_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALessThanOrEqGreaterLessEqualOperation(this);
    }

    public PPlusMinusExpr getPlusMinusSrc()
    {
        return this._plusMinusSrc_;
    }

    public void setPlusMinusSrc(PPlusMinusExpr node)
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

    public TLessThanOrEq getLessThanOrEq()
    {
        return this._lessThanOrEq_;
    }

    public void setLessThanOrEq(TLessThanOrEq node)
    {
        if(this._lessThanOrEq_ != null)
        {
            this._lessThanOrEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lessThanOrEq_ = node;
    }

    public PPlusMinusExpr getPlusMinusTarget()
    {
        return this._plusMinusTarget_;
    }

    public void setPlusMinusTarget(PPlusMinusExpr node)
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
            + toString(this._lessThanOrEq_)
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

        if(this._lessThanOrEq_ == child)
        {
            this._lessThanOrEq_ = null;
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
            setPlusMinusSrc((PPlusMinusExpr) newChild);
            return;
        }

        if(this._lessThanOrEq_ == oldChild)
        {
            setLessThanOrEq((TLessThanOrEq) newChild);
            return;
        }

        if(this._plusMinusTarget_ == oldChild)
        {
            setPlusMinusTarget((PPlusMinusExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}