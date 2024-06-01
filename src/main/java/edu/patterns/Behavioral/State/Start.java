package edu.patterns.Behavioral.State;

public class Start implements State{
    @Override
    public void startWorking(Operator operator) {
        System.out.println("Work already in process.");
    }

    @Override
    public void facilityChange(Operator operator) {
        System.out.println("Changed facility after a rest.");
        operator.setState(new ChangeFacility());
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
