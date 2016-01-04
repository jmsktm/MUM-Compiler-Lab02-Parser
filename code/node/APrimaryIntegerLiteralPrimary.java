/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class APrimaryIntegerLiteralPrimary extends PPrimary
{
    private TIntegerLiteral _integerLiteral_;

    public APrimaryIntegerLiteralPrimary()
    {
        // Constructor
    }

    public APrimaryIntegerLiteralPrimary(
        @SuppressWarnings("hiding") TIntegerLiteral _integerLiteral_)
    {
        // Constructor
        setIntegerLiteral(_integerLiteral_);

    }

    @Override
    public Object clone()
    {
        return new APrimaryIntegerLiteralPrimary(
            cloneNode(this._integerLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrimaryIntegerLiteralPrimary(this);
    }

    public TIntegerLiteral getIntegerLiteral()
    {
        return this._integerLiteral_;
    }

    public void setIntegerLiteral(TIntegerLiteral node)
    {
        if(this._integerLiteral_ != null)
        {
            this._integerLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integerLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integerLiteral_ == child)
        {
            this._integerLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integerLiteral_ == oldChild)
        {
            setIntegerLiteral((TIntegerLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}