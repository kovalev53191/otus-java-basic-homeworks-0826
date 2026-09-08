package ru.otus.java;

public class Box {
    private int size;
    private String color;
    private boolean boxStatus;
    private String item;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int size, String color, boolean boxStatus, String item) {
        this.size = size;
        this.color = color;
        this.boxStatus = boxStatus;
        this.item = item;
    }

    public boolean getBoxStatus() {
        return boxStatus;
    }

    public void setBoxStatus(boolean boxStatus) {
        this.boxStatus = boxStatus;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    void printBoxInfo() {
        System.out.println("Размер: " + size + "см");
        System.out.println("Цвет: " + color);
        System.out.println("Коробка: " + boxStatus);
        System.out.println("Содержимое: " + item);
    }
}
