package edu.patterns.Behavioral.TemplateMethod;

public class CakeWithApples extends CakeBaker{
    @Override
    void biscuit() {
        System.out.println("Three-layer vanilla biscuit");
    }

    @Override
    void toppings() {
        System.out.println("Apples, cream-cheese");
    }
}