package com.rajsaswa.designpatterns.bridge.model;

/**
 * Represents a bike vehicle
 */
public class Bike extends Vehicle
{
    private static final Double RAW_MANUFACTURING_PRICE = 8000D;

    public Bike(TaxApplier taxApplier)
    {
        super(taxApplier);
    }

    @Override
    public Double getPrice()
    {
        return RAW_MANUFACTURING_PRICE + taxApplier.getTaxAmount();
    }
}
