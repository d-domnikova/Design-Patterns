package edu.patterns.Creational.Singelton;

public class Performance {
    private static Performance performance = null;
    private Performance() { }
    public static Performance getInstance(){
        if (performance == null) {
            performance = new Performance();
        }
        return performance;
    }

    public static void started(){
        System.out.println("Performance is started.");
    }
    public static void ended(){
        System.out.println("Performance is ended.");
    }
}
