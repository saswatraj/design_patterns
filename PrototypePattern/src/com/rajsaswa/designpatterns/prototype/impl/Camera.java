package com.rajsaswa.designpatterns.prototype.impl;

import com.rajsaswa.designpatterns.prototype.model.Photograph;

/**
 * Represents a camera
 */
public class Camera
{
    public Photograph takePhotograph()
    {
        Photograph photograph = PrototypeRegistry.get(Settings.getPhotoType());
        photograph.takePhotograph();
        return photograph;
    }
}
