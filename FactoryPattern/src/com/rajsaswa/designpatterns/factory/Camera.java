package com.rajsaswa.designpatterns.factory;

public class Camera
{
    private static PhotoFactory photoFactory = new CameraPhotoFactory();

    public Photograph takePhotograph()
    {
        Photograph photograph = photoFactory.createPhotograph();
        photograph.takePhotograph();
        return photograph;
    }
}
