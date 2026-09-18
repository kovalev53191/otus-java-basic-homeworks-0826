package ru.otus.java;

public class Plate {
    private final int maxFood = 100;
    private int currentFood;

    public void addFood(int food) {
        int sizePlate = maxFood - currentFood;
        if(maxFood >= food && sizePlate >= food) {
            currentFood += food;
        }
    }

    public boolean reduceFood(int appetite) {
        if (currentFood >= appetite) {
            currentFood -= appetite;
            return true;
        }
        return false;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxFood=" + maxFood +
                ", currentFood=" + currentFood +
                '}';
    }
}
