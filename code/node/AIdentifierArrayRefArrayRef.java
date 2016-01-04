/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIdentifierArrayRefArrayRef extends PArrayRef
{
    private TIdentifier _identifier_;
    private TLBkt _lBkt_;
    private TIntegerLiteral _integerLiteral_;
    private TRBkt _rBkt_;

    public AIdentifierArrayRefArrayRef()
    {
        // Constructor
    }

    public AIdentifierArrayRefArrayRef(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TLBkt _lBkt_,
        @SuppressWarnings("hiding") TIntegerLiteral _integerLiteral_,
        @SuppressWarnings("hiding") TRBkt _rBkt_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setLBkt(_lBkt_);

        setIntegerLiteral(_integerLiteral_);

        setRBkt(_rBkt_);

    }

    @Override
    public Object clone()
    {
        return new AIdentifierArrayRefArrayRef(
            cloneNode(this._identifier_),
            cloneNode(this._lBkt_),
            cloneNode(this._integerLiteral_),
            cloneNode(this._rBkt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierArrayRefArrayRef(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public TLBkt getLBkt()
    {
        return this._lBkt_;
    }

    public void setLBkt(TLBkt node)
    {
        if(this._lBkt_ != null)
        {
            this._lBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBkt_ = node;
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

    public TRBkt getRBkt()
    {
        return this._rBkt_;
    }

    public void setRBkt(TRBkt node)
    {
        if(this._rBkt_ != null)
        {
            this._rBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBkt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._lBkt_)
            + toString(this._integerLiteral_)
            + toString(this._rBkt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._lBkt_ == child)
        {
            this._lBkt_ = null;
            return;
        }

        if(this._integerLiteral_ == child)
        {
            this._integerLiteral_ = null;
            return;
        }

        if(this._rBkt_ == child)
        {
            this._rBkt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._lBkt_ == oldChild)
        {
            setLBkt((TLBkt) newChild);
            return;
        }

        if(this._integerLiteral_ == oldChild)
        {
            setIntegerLiteral((TIntegerLiteral) newChild);
            return;
        }

        if(this._rBkt_ == oldChild)
        {
            setRBkt((TRBkt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}