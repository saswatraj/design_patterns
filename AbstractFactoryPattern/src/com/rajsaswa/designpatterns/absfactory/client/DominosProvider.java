package com.rajsaswa.designpatterns.absfactory.client;

import com.rajsaswa.designpatterns.absfactory.clientlib.Pizza;
import com.rajsaswa.designpatterns.absfactory.clientlib.PizzaProvider;

/**
 * Provides dominos pizzas
 */
public class DominosProvider extends PizzaProvider
{
    @Override
    public Pizza createPizza()
    {
        return new MediumDominosPizza();
    }

    @Override
    public void deliverPizza(Pizza pizza)
    {
        if ("Medium".equals(pizza.getPizzaType())) {
            throw new RuntimeException("Apologies !! We only deliver for large pizzas");
        }
    }
}
