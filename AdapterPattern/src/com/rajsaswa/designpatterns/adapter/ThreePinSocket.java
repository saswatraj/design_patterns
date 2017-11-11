package com.rajsaswa.designpatterns.adapter;

/**
 * Class represents a three pin socket
 */
public class ThreePinSocket
{
    private boolean pin1;
    private boolean pin2;
    private boolean pin3;

    public ThreePinSocket(boolean pin1, boolean pin2, boolean pin3)
    {
        this.pin1 = pin1;
        this.pin2 = pin2;
        this.pin3 = pin3;
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

    public boolean isPin3()
    {
        return pin3;
    }

    public void setPin3(boolean pin3)
    {
        this.pin3 = pin3;
    }

    public void turnOff()
    {
        pin1 = Boolean.FALSE;
        pin2 = Boolean.FALSE;
        pin3 = Boolean.FALSE;
    }

    public void turnOn()
    {
        pin1 = Boolean.TRUE;
        pin2 = Boolean.TRUE;
        pin3 = Boolean.TRUE;
    }
}
