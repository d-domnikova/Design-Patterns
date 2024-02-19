package edu.patterns;

import edu.patterns.Creational.Prototype.Reservation;
import edu.patterns.Creational.Singelton.Performance;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Singelton:");
        Performance performance = Performance.getInstance();
        performance.started();
        performance.ended();
        System.out.println();

        System.out.println("-----Prototype:");
        Reservation reservation = new Reservation("Kate");
        Reservation anotherReservation = (Reservation) reservation.doClone();
        System.out.println(reservation);
        System.out.println(anotherReservation);

    }
}