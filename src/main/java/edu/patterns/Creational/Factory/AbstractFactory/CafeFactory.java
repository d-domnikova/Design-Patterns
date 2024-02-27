package edu.patterns.Creational.Factory.AbstractFactory;

import edu.patterns.Creational.Factory.*;

public class CafeFactory {
    public CoffeeTypeMethod makeCafeFactory(CafeFactoryType cafeFactoryType){
        switch (cafeFactoryType){
            case TEA_FACTORY -> {
                return new TeaFactory();
            }
            case COFFEE_FACTORY -> {
                return new CoffeeFactory();
            }
        }
        return null;
    }
}
