package com.rajsaswa.designpatterns.adapter;

/**
 * This class models a two pin socket
 */
public class TwoPinSocket
{
    private boolean pin1;
    private boolean pin2;

    public TwoPinSocket(boolean pin1, boolean pin2)
    {
        this.pin1 = pin1;
        this.pin2 = pin2;
    }

    public boolean isPin1()
    {
        return pin1;
    }

    public void setPin1(boolean pin1)
    {
        this.pin1 = pin1;
    }

    public boolean isPin2()
    {
        return pin2;
    }

    public void setPin2(boolean pin2)
    {
        this.pin2 = pin2;
    }

    public void turnOff()
    {
        pin1 = Boolean.FALSE;
        pin2 = Boolean.FALSE;
    }

    public void turnOn()
    {
        pin1 = Boolean.TRUE;
        pin2 = Boolean.TRUE;
    }
}
