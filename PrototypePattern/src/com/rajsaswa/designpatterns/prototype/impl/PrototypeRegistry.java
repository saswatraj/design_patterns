package com.rajsaswa.designpatterns.prototype.impl;

import com.rajsaswa.designpatterns.prototype.model.BNWPhotograph;
import com.rajsaswa.designpatterns.prototype.model.ColoredPhotograph;
import com.rajsaswa.designpatterns.prototype.model.Photograph;

import java.util.Map;

public class PrototypeRegistry
{
    private static Map<String, Photograph> registry;

    public PrototypeRegistry()
    {
        //register defaults
        BNWPhotograph bnwPhotograph = new BNWPhotograph();
        registry.put("BNW", bnwPhotograph);

        ColoredPhotograph coloredPhotograph = new ColoredPhotograph();
        registry.put("Colored", coloredPhotograph);
    }

    public static Photograph get(String type)
    {
        Photograph photograph = registry.get(type);
        if (photograph == null) {
            throw new RuntimeException("Type not registered");
        }
        return photograph.clone();
    }

    public void register(String type, Photograph photograph)
    {
        if (registry.containsKey(type)) {
            throw new RuntimeException("Already registered key");
        }
        registry.put(type, photograph);
    }
}
