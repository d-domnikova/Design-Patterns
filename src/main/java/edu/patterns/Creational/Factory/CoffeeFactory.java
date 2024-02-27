package edu.patterns.Creational.Factory;

import edu.patterns.Creational.Factory.Types.*;

public class CoffeeFactory extends CoffeeTypeMethod {
    @Override
    public Coffee makeCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case LATTE -> {
                return new Latte();
            }
            case AMERICANO -> {
                return new Americano();
            }
            case ESPRESSO -> {
                return new Espresso();
            }
        }
        return null;
    }
}
