package com.rajsaswa.designpatterns.composite.model;

import java.util.List;

/**
 * Represents a file system node
 */
public interface FSNode
{
    long getSizeInBytes();

    List<FSNode> getChildren();

    void addChildren(FSNode fsNode);
}
