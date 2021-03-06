/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotAnEqualityExpr extends PEqualityExpr
{
    private PComparisonExpr _comparisonExpr_;

    public ANotAnEqualityExpr()
    {
        // Constructor
    }

    public ANotAnEqualityExpr(
        @SuppressWarnings("hiding") PComparisonExpr _comparisonExpr_)
    {
        // Constructor
        setComparisonExpr(_comparisonExpr_);

    }

    @Override
    public Object clone()
    {
        return new ANotAnEqualityExpr(
            cloneNode(this._comparisonExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotAnEqualityExpr(this);
    }

    public PComparisonExpr getComparisonExpr()
    {
        return this._comparisonExpr_;
    }

    public void setComparisonExpr(PComparisonExpr node)
    {
        if(this._comparisonExpr_ != null)
        {
            this._comparisonExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparisonExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comparisonExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comparisonExpr_ == child)
        {
            this._comparisonExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comparisonExpr_ == oldChild)
        {
            setComparisonExpr((PComparisonExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
