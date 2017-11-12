package com.rajsaswa.designpatterns.bridge;

import com.rajsaswa.designpatterns.bridge.model.Bike;
import com.rajsaswa.designpatterns.bridge.model.Car;
import com.rajsaswa.designpatterns.bridge.model.StateATaxApplier;
import com.rajsaswa.designpatterns.bridge.model.StateBTaxApplier;

public class BridgePattern
{
    public static void main(String args[])
    {
        Car carOfStateA = new Car(new StateATaxApplier());
        Car carOfStateB = new Car(new StateBTaxApplier());
        Bike bikeOfStateA = new Bike(new StateATaxApplier());
        System.out.println("Price of car in state A: " + carOfStateA.getPrice());
        System.out.println("Price of car in state B: " + carOfStateB.getPrice());
        System.out.println("Price of bike in state A: " + bikeOfStateA.getPrice());
    }
}
