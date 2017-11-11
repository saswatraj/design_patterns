package com.rajsaswa.designpatterns.adapter;

/**
 * Adapter for 3-pin socket that can be used as a two pin socket
 */
public class ThreePinToTwoPinSocketAdapter extends TwoPinSocket
{
    private ThreePinSocket threePinSocket;

    public ThreePinToTwoPinSocketAdapter(ThreePinSocket threePinSocket)
    {
        super(threePinSocket.isPin1(), threePinSocket.isPin2());
        this.threePinSocket = threePinSocket;
    }

    @Override
    public void turnOff()
    {
        threePinSocket.turnOff();
    }

    @Override
    public void turnOn()
    {
        threePinSocket.turnOn();
    }
}
