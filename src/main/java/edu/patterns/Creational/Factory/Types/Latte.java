package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class Latte extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Latte is ready.";
    }
}