package edu.patterns.Behavioral.State;

public interface State {
    void startWorking(Operator operator);
    void facilityChange(Operator operator);
    void takeABreak(Operator operator);
    void exhausted(Operator operator);
}
