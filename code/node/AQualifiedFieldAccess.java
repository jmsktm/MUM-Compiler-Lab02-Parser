/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AQualifiedFieldAccess extends PFieldAccess
{
    private TIdentifier _identifier_;
    private TDot _dot_;
    private PFieldAccess _fieldAccess_;

    public AQualifiedFieldAccess()
    {
        // Constructor
    }

    public AQualifiedFieldAccess(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PFieldAccess _fieldAccess_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setDot(_dot_);

        setFieldAccess(_fieldAccess_);

    }

    @Override
    public Object clone()
    {
        return new AQualifiedFieldAccess(
            cloneNode(this._identifier_),
            cloneNode(this._dot_),
            cloneNode(this._fieldAccess_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQualifiedFieldAccess(this);
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

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public PFieldAccess getFieldAccess()
    {
        return this._fieldAccess_;
    }

    public void setFieldAccess(PFieldAccess node)
    {
        if(this._fieldAccess_ != null)
        {
            this._fieldAccess_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldAccess_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._dot_)
            + toString(this._fieldAccess_);
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

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._fieldAccess_ == child)
        {
            this._fieldAccess_ = null;
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

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._fieldAccess_ == oldChild)
        {
            setFieldAccess((PFieldAccess) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
