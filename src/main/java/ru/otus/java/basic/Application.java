package ru.otus.java.basic;

import ru.otus.java.basic.animals.*;

public class Application {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 13.9,  150);
        Animal dog = new Dog("Niko",19.4,1.5,250);
        Animal horse = new Horse("Star",22.2,2.0,450);

        System.out.println("dog " + dog.run(100) + " " + dog.swim(50));
        System.out.println("horse " + horse.run(100) + " " + horse.swim(50));
        System.out.println("cat " + cat.run(100) + " " + cat.swim(50));
        cat.info();
        dog.info();
        horse.info();
    }
}
