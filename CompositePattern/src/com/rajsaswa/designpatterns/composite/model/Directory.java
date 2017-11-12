package com.rajsaswa.designpatterns.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a directory.
 */
public class Directory implements FSNode
{
    private List<FSNode> children;
    private String directoryName;

    public Directory(String name)
    {
        directoryName = name;
        children = new ArrayList<>();
    }

    @Override
    public long getSizeInBytes()
    {
        long size = 0;
        for (FSNode child : children) {
            size += child.getSizeInBytes();
        }
        return size;
    }

    @Override
    public List<FSNode> getChildren()
    {
        return children;
    }

    @Override
    public void addChildren(FSNode fsNode)
    {
        children.add(fsNode);
    }
}
