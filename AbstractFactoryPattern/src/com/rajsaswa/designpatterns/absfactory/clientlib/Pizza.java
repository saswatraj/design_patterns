package com.rajsaswa.designpatterns.absfactory.clientlib;

/**
 * Abstract class which defines what a pizza should have
 */
public abstract class Pizza
{
    public abstract Double getPizzaCost();

    public abstract String getPizzaType();

    public abstract Double getPizzaSize();
}
