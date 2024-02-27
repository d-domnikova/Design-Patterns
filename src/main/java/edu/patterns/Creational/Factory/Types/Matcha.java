package edu.patterns.Creational.Factory.Types;

import edu.patterns.Creational.Factory.Coffee;

public class Matcha extends Coffee {
    @Override
    public String coffeeIsReady() {
        return "Matcha is ready.";
    }
}