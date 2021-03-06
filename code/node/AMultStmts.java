/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMultStmts extends PStmts
{
    private PStmts _stmts_;
    private PGenericStmt _genericStmt_;

    public AMultStmts()
    {
        // Constructor
    }

    public AMultStmts(
        @SuppressWarnings("hiding") PStmts _stmts_,
        @SuppressWarnings("hiding") PGenericStmt _genericStmt_)
    {
        // Constructor
        setStmts(_stmts_);

        setGenericStmt(_genericStmt_);

    }

    @Override
    public Object clone()
    {
        return new AMultStmts(
            cloneNode(this._stmts_),
            cloneNode(this._genericStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultStmts(this);
    }

    public PStmts getStmts()
    {
        return this._stmts_;
    }

    public void setStmts(PStmts node)
    {
        if(this._stmts_ != null)
        {
            this._stmts_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmts_ = node;
    }

    public PGenericStmt getGenericStmt()
    {
        return this._genericStmt_;
    }

    public void setGenericStmt(PGenericStmt node)
    {
        if(this._genericStmt_ != null)
        {
            this._genericStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._genericStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmts_)
            + toString(this._genericStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stmts_ == child)
        {
            this._stmts_ = null;
            return;
        }

        if(this._genericStmt_ == child)
        {
            this._genericStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stmts_ == oldChild)
        {
            setStmts((PStmts) newChild);
            return;
        }

        if(this._genericStmt_ == oldChild)
        {
            setGenericStmt((PGenericStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
