package edu.patterns.Behavioral.State;

public class Pause implements State{
    @Override
    public void startWorking(Operator operator) {
        System.out.println("Started work after a rest.");
        operator.setState(new Start());
    }

    @Override
    public void facilityChange(Operator operator) {
        System.out.println("Changed facility after a rest.");
        operator.setState(new ChangeFacility());
    }

    @Override
    public void takeABreak(Operator operator) {
        System.out.println("Taking a break in dormitory.");
    }

    @Override
    public void exhausted(Operator operator) {
        System.out.println("Already taking a break.");
    }
}
