package edu.patterns.Behavioral.State;

public class Exhausted implements State{
    @Override
    public void startWorking(Operator operator) {
        System.out.println("Too exhausted to start working.");
    }

    @Override
    public void facilityChange(Operator operator) {
        System.out.println("Too exhausted to change facility.");
    }

    @Override
    public void takeABreak(Operator operator) {
        System.out.println("Decided to take a break in the dormitory.");
        operator.setState(new Pause());
    }

    @Override
    public void exhausted(Operator operator) {
        System.out.println("Already exhausted.");
    }
}