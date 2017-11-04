package com.rajsaswa.designpatterns.absfactory.client;

import com.rajsaswa.designpatterns.absfactory.clientlib.Pizza;

/**
 * Represents a medium sized dominos pizza
 */
public class MediumDominosPizza extends Pizza
{
    private static final String MEDIUM_PIZZA_TYPE = "Medium";
    private static final Double MEDIUM_PIZZA_COST = 300.0;
    private static final Double MEDIUM_PIZZA_AREA = Math.PI * 7 * 7;

    @Override
    public Double getPizzaCost()
    {
        return MEDIUM_PIZZA_COST;
    }

    @Override
    public String getPizzaType()
    {
        return MEDIUM_PIZZA_TYPE;
    }

    @Override
    public Double getPizzaSize()
    {
        return MEDIUM_PIZZA_AREA;
    }
}
