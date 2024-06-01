package edu.patterns.Behavioral.TemplateMethod;

public class ChocolateCake extends CakeBaker{

    @Override
    void biscuit() {
        System.out.println("Two-layer chocolate biscuit");
    }

    @Override
    void toppings() {
        System.out.println("Strawberries");
    }
}
