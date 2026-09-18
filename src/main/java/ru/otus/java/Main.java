package ru.otus.java;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.addFood(50);
        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzik", 15),
                new Cat("Misha", 10)
        };
        eatCats(cats, plate);
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isSatiety() ? "сыт" : "голоден"));
        }
    }

    private static void eatCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}
