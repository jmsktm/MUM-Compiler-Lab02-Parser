/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AArrDeclField extends PField
{
    private PType _type_;
    private TIdentifier _identifier_;
    private TLBkt _lBkt_;
    private PIntegerParamOrValue _integerParamOrValue_;
    private TRBkt _rBkt_;

    public AArrDeclField()
    {
        // Constructor
    }

    public AArrDeclField(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TLBkt _lBkt_,
        @SuppressWarnings("hiding") PIntegerParamOrValue _integerParamOrValue_,
        @SuppressWarnings("hiding") TRBkt _rBkt_)
    {
        // Constructor
        setType(_type_);

        setIdentifier(_identifier_);

        setLBkt(_lBkt_);

        setIntegerParamOrValue(_integerParamOrValue_);

        setRBkt(_rBkt_);

    }

    @Override
    public Object clone()
    {
        return new AArrDeclField(
            cloneNode(this._type_),
            cloneNode(this._identifier_),
            cloneNode(this._lBkt_),
            cloneNode(this._integerParamOrValue_),
            cloneNode(this._rBkt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrDeclField(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public PIntegerParamOrValue getIntegerParamOrValue()
    {
        return this._integerParamOrValue_;
    }

    public void setIntegerParamOrValue(PIntegerParamOrValue node)
    {
        if(this._integerParamOrValue_ != null)
        {
            this._integerParamOrValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerParamOrValue_ = node;
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
            + toString(this._type_)
            + toString(this._identifier_)
            + toString(this._lBkt_)
            + toString(this._integerParamOrValue_)
            + toString(this._rBkt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

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

        if(this._integerParamOrValue_ == child)
        {
            this._integerParamOrValue_ = null;
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
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

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

        if(this._integerParamOrValue_ == oldChild)
        {
            setIntegerParamOrValue((PIntegerParamOrValue) newChild);
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
