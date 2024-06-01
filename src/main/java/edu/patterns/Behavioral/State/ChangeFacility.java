package edu.patterns.Behavioral.State;

public class ChangeFacility implements State{
    @Override
    public void startWorking(Operator operator) {
        System.out.println("Starting work after facility change.");
        operator.setState(new Start());
    }

    @Override
    public void facilityChange(Operator operator) {
        System.out.println("Already changed facility.");
    }

    @Override
    public void takeABreak(Operator operator) {
        System.out.println("Decided to take a break in the dormitory.");
        operator.setState(new Pause());
    }

    @Override
    public void exhausted(Operator operator) {
        System.out.println("Too exhausted to continue working.");
        operator.setState(new Exhausted());
    }
}