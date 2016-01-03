/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMemberDecls extends PMemberDecls
{
    private PMemberDecl _memberDecl_;

    public AMemberDecls()
    {
        // Constructor
    }

    public AMemberDecls(
        @SuppressWarnings("hiding") PMemberDecl _memberDecl_)
    {
        // Constructor
        setMemberDecl(_memberDecl_);

    }

    @Override
    public Object clone()
    {
        return new AMemberDecls(
            cloneNode(this._memberDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMemberDecls(this);
    }

    public PMemberDecl getMemberDecl()
    {
        return this._memberDecl_;
    }

    public void setMemberDecl(PMemberDecl node)
    {
        if(this._memberDecl_ != null)
        {
            this._memberDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._memberDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._memberDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._memberDecl_ == child)
        {
            this._memberDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._memberDecl_ == oldChild)
        {
            setMemberDecl((PMemberDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
