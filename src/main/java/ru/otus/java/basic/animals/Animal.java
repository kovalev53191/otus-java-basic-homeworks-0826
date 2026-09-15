package ru.otus.java.basic.animals;

public abstract class Animal {
    protected String name;
    protected double runSpeed;
    protected double swimmingSpeed;
    protected int endurance;

    public int run(int distance) {
        if(endurance >= distance) {
            endurance -= distance;
            double time = (double) distance / runSpeed;
            return (int) Math.ceil(time);
        }
        System.out.println("У " + name + " появилось состояние усталости");
        return -1;
    }

    public int swim(int distance) {
        if(endurance != 0) {
            int result = 0;
            return result;
        }
        System.out.println("У " + name + " появилось состояние усталости");
        return -1;
    }
    public void info() {
        System.out.println("У " + name + " Выносливость: " + endurance);
    }
}
