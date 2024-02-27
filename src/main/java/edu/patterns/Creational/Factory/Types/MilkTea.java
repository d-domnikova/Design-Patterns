package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class MilkTea extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Milk Tea is ready.";
    }
}