package com.rajsaswa.designpatterns.absfactory.clientlib;

/**
 * Abstract class defining how a pizza provider should be
 */
public abstract class PizzaProvider
{
    public abstract Pizza createPizza();

    public abstract void deliverPizza(Pizza pizza);
}
