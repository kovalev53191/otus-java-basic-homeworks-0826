package ru.otus.java;

public class Box {
    private final int size;
    private String color;
    private boolean status;
    private String item;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int size, String color, boolean boxStatus, String item) {
        this.size = size;
        this.color = color;
        this.status = boxStatus;
        this.item = item;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void put(String Item, String putItem) {
        if (this.status == true) {
            if (putItem.equals("Положить")) {
                if (this.item == null) {
                    this.item = Item;
                    System.out.println("Вы положили " + Item + " в коробку");
                } else {
                    System.out.println("Коробка уже заполнена");
                }
            }
            else if (putItem.equals("Убрать")) {
                if (this.item != null) {
                    String deleteItem = this.item;
                    System.out.println("Вы убрали " + deleteItem + " из коробки");
                    this.item = null;
                } else {
                    System.out.println("Вы пытаетесь убрать предмет, которого нет");
                }
            }
            else {
                System.out.println("Пишите 'Положить' или 'Убрать'");
            }
        } else {
            System.out.println("Вы забыли открыть коробку");
        }
    }

    public void open(String boxOpen) {
        if (boxOpen.equals("Открыть")) {
            this.status = true;
            System.out.println("Вы открыли коробку");

        } else if (boxOpen.equals("Закрыть")) {
            this.status = false;
            System.out.println("Вы закрыли коробку");
        } else {
            System.out.println("Неверное действие");
        }
    }

    void printBoxInfo() {
        System.out.println("Размер: " + size + "см");
        System.out.println("Цвет: " + color);
        System.out.println("Коробка: " + status);
        System.out.println("Содержимое: " + item);
    }
}
