package edu.patterns.Behavioral.TemplateMethod;

public abstract class CakeBaker {
    void form(){
        System.out.println("Round shape");
    };
    abstract void biscuit();
    abstract void toppings();

    public void bakeCake(){
        form();
        biscuit();
        toppings();
    }
}
