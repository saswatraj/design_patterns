package com.rajsaswa.designpatterns.composite;

import com.rajsaswa.designpatterns.composite.model.Directory;
import com.rajsaswa.designpatterns.composite.model.FSNode;

import java.io.File;

public class CompositeClient
{
    public static void main(String args[])
    {
        // create a file and a directory and add the file to it
        File file = new File("example.txt");
        com.rajsaswa.designpatterns.composite.model.File myFile =
            new com.rajsaswa.designpatterns.composite.model.File(file);
        Directory directory = new Directory("exmapleDirectory");
        printSize(directory);
        printSize(myFile);
    }

    private static void printSize(FSNode fsNode)
    {
        System.out.println("Size of component: " + fsNode.getSizeInBytes());
    }
}
