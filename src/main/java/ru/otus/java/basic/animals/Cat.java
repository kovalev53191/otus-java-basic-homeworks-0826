package ru.otus.java.basic.animals;

public class Cat extends Animal {

    public Cat(String name, double runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот плавать не умеет");
        return -1;
    }
}