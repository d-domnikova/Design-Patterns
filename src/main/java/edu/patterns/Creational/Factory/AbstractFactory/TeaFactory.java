package edu.patterns.Creational.Factory.AbstractFactory;

import edu.patterns.Creational.Factory.*;
import edu.patterns.Creational.Factory.Types.*;

public class TeaFactory extends CoffeeTypeMethod {
    @Override
    public Coffee makeCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case MATCHA -> {
                return new Matcha();
            }
            case MILK_TEA -> {
                return new MilkTea();
            }
            case BLACK_TEA -> {
                return new BlackTea();
            }
        }
        return null;
    }
}