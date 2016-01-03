/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADoWhileLoopSimpleStmt extends PSimpleStmt
{
    private TDo _do_;
    private PStmts _stmts_;
    private TWhile _while_;
    private PCondition _condition_;
    private TSemicolon _semicolon_;

    public ADoWhileLoopSimpleStmt()
    {
        // Constructor
    }

    public ADoWhileLoopSimpleStmt(
        @SuppressWarnings("hiding") TDo _do_,
        @SuppressWarnings("hiding") PStmts _stmts_,
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") PCondition _condition_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setDo(_do_);

        setStmts(_stmts_);

        setWhile(_while_);

        setCondition(_condition_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ADoWhileLoopSimpleStmt(
            cloneNode(this._do_),
            cloneNode(this._stmts_),
            cloneNode(this._while_),
            cloneNode(this._condition_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADoWhileLoopSimpleStmt(this);
    }

    public TDo getDo()
    {
        return this._do_;
    }

    public void setDo(TDo node)
    {
        if(this._do_ != null)
        {
            this._do_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._do_ = node;
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

    public TWhile getWhile()
    {
        return this._while_;
    }

    public void setWhile(TWhile node)
    {
        if(this._while_ != null)
        {
            this._while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._while_ = node;
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

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._do_)
            + toString(this._stmts_)
            + toString(this._while_)
            + toString(this._condition_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._do_ == child)
        {
            this._do_ = null;
            return;
        }

        if(this._stmts_ == child)
        {
            this._stmts_ = null;
            return;
        }

        if(this._while_ == child)
        {
            this._while_ = null;
            return;
        }

        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._do_ == oldChild)
        {
            setDo((TDo) newChild);
            return;
        }

        if(this._stmts_ == oldChild)
        {
            setStmts((PStmts) newChild);
            return;
        }

        if(this._while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(this._condition_ == oldChild)
        {
            setCondition((PCondition) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
