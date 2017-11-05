package com.rajsaswa.designpatterns.factory;

public class CameraPhotoFactory extends PhotoFactory
{
    @Override
    public Photograph createPhotograph()
    {
        if (Settings.isInColorMode()) {
            return new ColoredPhotograph();
        }
        return new BNWPhotograph();
    }
}
