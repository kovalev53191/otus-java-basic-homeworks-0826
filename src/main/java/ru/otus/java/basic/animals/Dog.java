package ru.otus.java.basic.animals;

public class Dog extends Animal {

    public Dog(String name, double runSpeed, double swimmingSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    @Override
    public int swim(int distance) {
        int cost = distance * 2;
        if(endurance >= cost) {
            endurance -= cost;
            return (int) Math.ceil((double) distance / swimmingSpeed);
        }
        System.out.println("У " + name + " появилось состояние усталости");
        return -1;
    }
}
