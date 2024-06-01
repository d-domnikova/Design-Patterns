package edu.patterns.Behavioral.Strategy;

public class UsingTheEnvironmentStrategy implements MissionStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Trying strategy that uses the environment.");
    }
}
