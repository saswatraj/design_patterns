package com.rajsaswa.designpatterns.bridge.model;

/**
 * Tax applier in state A
 */
public class StateATaxApplier implements TaxApplier
{
    private static final Double STATE_A_TAX = 2.3;

    @Override
    public Double getTaxAmount()
    {
        return STATE_A_TAX;
    }
}
