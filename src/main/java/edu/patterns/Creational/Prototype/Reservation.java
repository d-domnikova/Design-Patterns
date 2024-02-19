package edu.patterns.Creational.Prototype;

public class Reservation implements Prototype {
    String name;
    public Reservation (String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Reservation(name);
    }

    @Override
    public String toString() {
        return "This table is reserved for " + name;
    }
}
