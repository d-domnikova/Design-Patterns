package edu.patterns;

import edu.patterns.Behavioral.Observer.CatastropheData;
import edu.patterns.Behavioral.Observer.CatastropheMessenger;
import edu.patterns.Behavioral.Observer.CatastropheType;
import edu.patterns.Behavioral.Observer.ObservationCenter;
import edu.patterns.Behavioral.State.Operator;
import edu.patterns.Behavioral.State.Start;
import edu.patterns.Behavioral.Strategy.BruteForceStrategy;
import edu.patterns.Behavioral.Strategy.UsingTheEnvironmentStrategy;
import edu.patterns.Behavioral.Strategy.OperationTeam;
import edu.patterns.Behavioral.TemplateMethod.CakeBaker;
import edu.patterns.Behavioral.TemplateMethod.CakeWithApples;
import edu.patterns.Behavioral.TemplateMethod.ChocolateCake;
import edu.patterns.Creational.Builder.*;
import edu.patterns.Creational.Factory.AbstractFactory.*;
import edu.patterns.Creational.Factory.*;
import edu.patterns.Creational.Prototype.*;
import edu.patterns.Creational.Singelton.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Creational:");
        System.out.println("-------Singelton:");
        Performance performance = Performance.getInstance();
        performance.started();
        performance.ended();
        System.out.println();

        System.out.println("-------Prototype:");
        Reservation reservation = new Reservation("Kate");
        Reservation anotherReservation = (Reservation) reservation.doClone();
        System.out.println(reservation);
        System.out.println(anotherReservation);
        System.out.println();

        System.out.println("-------Builder:");
        Order order = new Order.OrderBuilder()
                .setBreakfast("French Toasts")
                .setSandwich("Falafel")
                .setDessert("Classic Vanilla Cheesecake")
                .setDrink("Latte")
                .build();
        System.out.println(order.toString());
        System.out.println();

        System.out.println("-----Abstract Factory and Factory:");
        CafeFactory cafeFactory = new CafeFactory();
        CoffeeTypeMethod coffeeFactory = cafeFactory.makeCafeFactory(CafeFactoryType.COFFEE_FACTORY);
        CoffeeTypeMethod teaFactory = cafeFactory.makeCafeFactory(CafeFactoryType.TEA_FACTORY);

        List<Coffee> drinks = new ArrayList<>();

        Coffee latte = coffeeFactory.makeCoffee(CoffeeType.LATTE);
        Coffee americano = coffeeFactory.makeCoffee(CoffeeType.AMERICANO);
        Coffee espresso = coffeeFactory.makeCoffee(CoffeeType.ESPRESSO);
        Coffee milkTea = teaFactory.makeCoffee(CoffeeType.MILK_TEA);
        Coffee blackTea = teaFactory.makeCoffee(CoffeeType.BLACK_TEA);
        Coffee matcha = teaFactory.makeCoffee(CoffeeType.MATCHA);
        drinks.add(latte);
        drinks.add(americano);
        drinks.add(espresso);
        drinks.add(milkTea);
        drinks.add(blackTea);
        drinks.add(matcha);

        drinks.forEach(drink -> System.out.println(drink.coffeeIsReady()));
        System.out.println();


        System.out.println("---Behavioral:");
        System.out.println("-------Observer:");
        ObservationCenter center = new ObservationCenter();
        center.addObserver(new CatastropheMessenger());
        CatastropheData data = new CatastropheData(CatastropheType.FLOOD, "Iberia", LocalDateTime.now());
        center.obtainData(data);
        CatastropheData newData = new CatastropheData(CatastropheType.BLIZZARD, "Chernobog", LocalDateTime.now());
        center.obtainData(newData);
        System.out.println();

        System.out.println("-------State:");
        Operator operator = new Operator(new Start());
        operator.startWorking();
        operator.takeABreak();
        operator.facilityChange();
        operator.exhausted();
        System.out.println();

        System.out.println("-------Strategy:");
        OperationTeam team = new OperationTeam(new BruteForceStrategy());
        team.tryStrategy();
        System.out.println("Unsuccessful attempt. Try something else.");
        team.changeStrategy(new UsingTheEnvironmentStrategy());
        team.tryStrategy();
        System.out.println("Success.");
        System.out.println();

        System.out.println("-------Template Method:");
        CakeBaker chocolateCake = new ChocolateCake();
        chocolateCake.bakeCake();

        CakeBaker cakeWithApples = new CakeWithApples();
        cakeWithApples.bakeCake();
        System.out.println();
    }
}