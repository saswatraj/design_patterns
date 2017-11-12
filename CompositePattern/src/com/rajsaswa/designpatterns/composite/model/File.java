package com.rajsaswa.designpatterns.composite.model;

import java.util.ArrayList;
import java.util.List;

public class File implements FSNode
{
    private java.io.File file;
    private String fileName;

    public File(java.io.File file)
    {
        this.file = file;
        this.fileName = file.getName();
    }

    @Override
    public long getSizeInBytes()
    {
        return file.length();
    }

    @Override
    public List<FSNode> getChildren()
    {
        return new ArrayList<>();
    }

    @Override
    public void addChildren(FSNode fsNode)
    {
        throw new RuntimeException("Cannot add children for a file node");
    }
}
