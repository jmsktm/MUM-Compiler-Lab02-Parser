/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALocalDeclSimpleStmt extends PSimpleStmt
{
    private PLocalDecl _localDecl_;

    public ALocalDeclSimpleStmt()
    {
        // Constructor
    }

    public ALocalDeclSimpleStmt(
        @SuppressWarnings("hiding") PLocalDecl _localDecl_)
    {
        // Constructor
        setLocalDecl(_localDecl_);

    }

    @Override
    public Object clone()
    {
        return new ALocalDeclSimpleStmt(
            cloneNode(this._localDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALocalDeclSimpleStmt(this);
    }

    public PLocalDecl getLocalDecl()
    {
        return this._localDecl_;
    }

    public void setLocalDecl(PLocalDecl node)
    {
        if(this._localDecl_ != null)
        {
            this._localDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._localDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._localDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._localDecl_ == child)
        {
            this._localDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._localDecl_ == oldChild)
        {
            setLocalDecl((PLocalDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
