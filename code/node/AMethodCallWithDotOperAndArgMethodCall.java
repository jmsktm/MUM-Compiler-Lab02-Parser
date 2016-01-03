/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMethodCallWithDotOperAndArgMethodCall extends PMethodCall
{
    private TIdentifier _mainIdentifier_;
    private TDot _dot_;
    private TIdentifier _subIdentifier_;
    private TLPar _lPar_;
    private PArgs _args_;
    private TRPar _rPar_;

    public AMethodCallWithDotOperAndArgMethodCall()
    {
        // Constructor
    }

    public AMethodCallWithDotOperAndArgMethodCall(
        @SuppressWarnings("hiding") TIdentifier _mainIdentifier_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TIdentifier _subIdentifier_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PArgs _args_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setMainIdentifier(_mainIdentifier_);

        setDot(_dot_);

        setSubIdentifier(_subIdentifier_);

        setLPar(_lPar_);

        setArgs(_args_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AMethodCallWithDotOperAndArgMethodCall(
            cloneNode(this._mainIdentifier_),
            cloneNode(this._dot_),
            cloneNode(this._subIdentifier_),
            cloneNode(this._lPar_),
            cloneNode(this._args_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMethodCallWithDotOperAndArgMethodCall(this);
    }

    public TIdentifier getMainIdentifier()
    {
        return this._mainIdentifier_;
    }

    public void setMainIdentifier(TIdentifier node)
    {
        if(this._mainIdentifier_ != null)
        {
            this._mainIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mainIdentifier_ = node;
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

    public TIdentifier getSubIdentifier()
    {
        return this._subIdentifier_;
    }

    public void setSubIdentifier(TIdentifier node)
    {
        if(this._subIdentifier_ != null)
        {
            this._subIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subIdentifier_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PArgs getArgs()
    {
        return this._args_;
    }

    public void setArgs(PArgs node)
    {
        if(this._args_ != null)
        {
            this._args_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._args_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mainIdentifier_)
            + toString(this._dot_)
            + toString(this._subIdentifier_)
            + toString(this._lPar_)
            + toString(this._args_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mainIdentifier_ == child)
        {
            this._mainIdentifier_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._subIdentifier_ == child)
        {
            this._subIdentifier_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mainIdentifier_ == oldChild)
        {
            setMainIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._subIdentifier_ == oldChild)
        {
            setSubIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PArgs) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
