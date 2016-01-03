/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TStatic extends Token
{
    public TStatic()
    {
        super.setText("static");
    }

    public TStatic(int line, int pos)
    {
        super.setText("static");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStatic(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStatic(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStatic text.");
    }
}
