/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AUnmatchedElseWithElseUnmatchedIf extends PUnmatchedIf
{
    private TIf _if_;
    private PCondition _condition_;
    private PMatchedIf _unmatchedIfThen_;
    private TElse _else_;
    private PUnmatchedIf _unmatchedIfElse_;

    public AUnmatchedElseWithElseUnmatchedIf()
    {
        // Constructor
    }

    public AUnmatchedElseWithElseUnmatchedIf(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PCondition _condition_,
        @SuppressWarnings("hiding") PMatchedIf _unmatchedIfThen_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PUnmatchedIf _unmatchedIfElse_)
    {
        // Constructor
        setIf(_if_);

        setCondition(_condition_);

        setUnmatchedIfThen(_unmatchedIfThen_);

        setElse(_else_);

        setUnmatchedIfElse(_unmatchedIfElse_);

    }

    @Override
    public Object clone()
    {
        return new AUnmatchedElseWithElseUnmatchedIf(
            cloneNode(this._if_),
            cloneNode(this._condition_),
            cloneNode(this._unmatchedIfThen_),
            cloneNode(this._else_),
            cloneNode(this._unmatchedIfElse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnmatchedElseWithElseUnmatchedIf(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PCondition getCondition()
    {
        return this._condition_;
    }

    public void setCondition(PCondition node)
    {
        if(this._condition_ != null)
        {
            this._condition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condition_ = node;
    }

    public PMatchedIf getUnmatchedIfThen()
    {
        return this._unmatchedIfThen_;
    }

    public void setUnmatchedIfThen(PMatchedIf node)
    {
        if(this._unmatchedIfThen_ != null)
        {
            this._unmatchedIfThen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unmatchedIfThen_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public PUnmatchedIf getUnmatchedIfElse()
    {
        return this._unmatchedIfElse_;
    }

    public void setUnmatchedIfElse(PUnmatchedIf node)
    {
        if(this._unmatchedIfElse_ != null)
        {
            this._unmatchedIfElse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unmatchedIfElse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._condition_)
            + toString(this._unmatchedIfThen_)
            + toString(this._else_)
            + toString(this._unmatchedIfElse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        if(this._unmatchedIfThen_ == child)
        {
            this._unmatchedIfThen_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._unmatchedIfElse_ == child)
        {
            this._unmatchedIfElse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._condition_ == oldChild)
        {
            setCondition((PCondition) newChild);
            return;
        }

        if(this._unmatchedIfThen_ == oldChild)
        {
            setUnmatchedIfThen((PMatchedIf) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._unmatchedIfElse_ == oldChild)
        {
            setUnmatchedIfElse((PUnmatchedIf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}