/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFieldMember extends PMember
{
    private PField _field_;

    public AFieldMember()
    {
        // Constructor
    }

    public AFieldMember(
        @SuppressWarnings("hiding") PField _field_)
    {
        // Constructor
        setField(_field_);

    }

    @Override
    public Object clone()
    {
        return new AFieldMember(
            cloneNode(this._field_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldMember(this);
    }

    public PField getField()
    {
        return this._field_;
    }

    public void setField(PField node)
    {
        if(this._field_ != null)
        {
            this._field_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._field_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._field_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._field_ == child)
        {
            this._field_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._field_ == oldChild)
        {
            setField((PField) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}