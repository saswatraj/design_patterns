package com.rajsaswa.designpatterns.bridge.model;

/**
 * Represents a car vehicle
 */
public class Car extends Vehicle
{
    private static final Double RAW_MANUFACTURING_PRICE = 20000D;

    public Car(TaxApplier taxApplier)
    {
        super(taxApplier);
    }

    @Override
    public Double getPrice()
    {
        return RAW_MANUFACTURING_PRICE + taxApplier.getTaxAmount();
    }
}
