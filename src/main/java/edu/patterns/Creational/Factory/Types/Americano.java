package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class Americano extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Americano is ready.";
    }
}