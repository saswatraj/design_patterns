package com.rajsaswa.designpatterns.bridge.model;

public abstract class Vehicle
{
    TaxApplier taxApplier;

    public Vehicle(TaxApplier taxApplier)
    {
        this.taxApplier = taxApplier;
    }

    abstract Double getPrice();
}
