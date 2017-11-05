package com.rajsaswa.designpatterns.prototype.model;

/**
 * Interface for photograph
 */
public interface Photograph
{
    public void takePhotograph();

    public Photograph clone();
}
