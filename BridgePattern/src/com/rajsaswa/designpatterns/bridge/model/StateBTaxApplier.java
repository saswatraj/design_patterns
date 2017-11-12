package com.rajsaswa.designpatterns.bridge.model;

/**
 * Tax applier in state B
 */
public class StateBTaxApplier implements TaxApplier
{
    private static final Double STATE_B_TAX = 4.2;

    @Override
    public Double getTaxAmount()
    {
        return STATE_B_TAX;
    }
}
