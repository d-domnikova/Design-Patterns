package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class Espresso extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Espresso is ready.";
    }
}