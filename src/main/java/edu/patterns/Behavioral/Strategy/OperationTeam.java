package edu.patterns.Behavioral.Strategy;

public class OperationTeam {
    private MissionStrategy strategy;

    public OperationTeam(MissionStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(MissionStrategy strategy) {
        this.strategy = strategy;
    }

    public void tryStrategy(){
        strategy.executeStrategy();
    }
}
