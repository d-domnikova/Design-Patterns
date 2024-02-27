package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class BlackTea extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Black Tea is ready.";
    }
}