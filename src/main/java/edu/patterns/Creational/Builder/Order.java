package edu.patterns.Creational.Builder;

public class Order {
    private final String breakfast;
    private final String brunch;
    private final String lunch;
    private final String sandwich;
    private final String drink;
    private final String dessert;

    private Order(OrderBuilder builder) {
        this.breakfast = builder.breakfast;
        this.brunch = builder.brunch;
        this.lunch = builder.lunch;
        this.sandwich = builder.sandwich;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }

    @Override
    public String toString() {
        return "Your order:" + "\n" +
                "--Breakfast: " + breakfast + "\n" +
                "--Brunch: " + brunch + "\n" +
                "--Lunch: " + lunch + "\n" +
                "--Sandwich: " + sandwich + "\n" +
                "--Drink: " + drink + "\n" +
                "--Dessert: " + dessert;
    }

    public static class OrderBuilder {
        private String breakfast;
        private String brunch;
        private String lunch;
        private String sandwich;
        private String drink;
        private String dessert;

        public OrderBuilder() {}

        public OrderBuilder setBreakfast(String breakfast){
            this.breakfast = breakfast;
            return this;
        }
        public OrderBuilder setBrunch(String brunch){
            this.brunch = brunch;
            return this;
        }
        public OrderBuilder setLunch(String lunch){
            this.lunch = lunch;
            return this;
        }
        public OrderBuilder setSandwich(String sandwich){
            this.sandwich = sandwich;
            return this;
        }
        public OrderBuilder setDrink(String drink){
            this.drink = drink;
            return this;
        }
        public OrderBuilder setDessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public Order build() {return new Order(this);}
    }
}
