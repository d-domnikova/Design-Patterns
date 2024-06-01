package edu.patterns.Behavioral.Strategy;

public class BruteForceStrategy implements MissionStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Trying Brute Force Strategy.");
    }
}
