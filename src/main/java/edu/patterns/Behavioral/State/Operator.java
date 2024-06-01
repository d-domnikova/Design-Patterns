package edu.patterns.Behavioral.State;

public class Operator {
    private State state;

    public Operator(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void startWorking() {
        state.startWorking(this);
    }

    public void facilityChange() {
       state.facilityChange(this);
    }

    public void takeABreak() {
       state.takeABreak(this);
    }

    public void exhausted() {
        state.exhausted(this);
    }
}
