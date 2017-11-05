package com.rajsaswa.designpatterns.prototype.model;

public class ColoredPhotograph implements Photograph
{
    @Override
    public void takePhotograph()
    {
        // logic for taking a colored photograph
    }

    @Override
    public Photograph clone()
    {
        return this.clone();
    }
}
