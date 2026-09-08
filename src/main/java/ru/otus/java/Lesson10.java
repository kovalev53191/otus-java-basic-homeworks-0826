package ru.otus.java;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box myBox = new Box(50, "Красный", false, null);
        User user = new User("Ковалев", "Никита", "Владимирович", 1999, "kovalev53191@mail.ru");
        User[] userArray = {
                new User("Иванов", "Петр", "Сергеевич", 1980, "petr.ivanov@example.com"),
                new User("Смирнова", "Анна", "Владимировна", 1985, "anna.smirnova@example.com"),
                new User("Козлов", "Дмитрий", "Андреевич", 1985, "dmitry.kozlov@example.com"),
                new User("Васильева", "Елена", "Николаевна", 1990, "elena.vasilieva@example.com"),
                new User("Михайлов", "Алексей", "Иванович", 1983, "alexey.mikhailov@example.com"),
                new User("Соколова", "Ольга", "Михайловна", 1988, "olga.sokolova@example.com"),
                new User("Новиков", "Кирилл", "Петрович", 2001, "kirill.novikov@example.com"),
                new User("Лебедева", "Ирина", "Федоровна", 1999, "irina.lebedeva@example.com"),
                new User("Фёдоров", "Роман", "Юрьевич", 1982, "roman.fedorov@example.com"),
                new User("Григорьева", "Светлана", "Константиновна", 1966, "svetlana.grigorieva@example.com")
        };

        boolean isRunning = true;
        printMainMenu();

        while (isRunning) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    user.printUserInfo();
                    break;
                case 2:
                    int currentYear = 2026;
                    for (int i = 0; i < userArray.length; i++) {
                        User users = userArray[i];
                        int age = currentYear - users.getBirthYear();
                        if (age > 40) {
                            users.printUserInfo();
                            System.out.println("____________________________________");
                        }
                    }
                    break;
                case 3:
                    runBoxAction(scanner, myBox);
                    break;
                default:
                    System.out.println("Ничего не выбрано");
                    break;
            }
        }
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("1. Информация о пользователе");
        System.out.println("2. Информация о пользователях старше 40 лет");
        System.out.println("3. Коробка");
    }

    private static void printBoxMenu() {
        System.out.println("Введите '1' для открытия или закрытия коробки");
        System.out.println("Введите '2' для изменения цвета коробки");
        System.out.println("Введите '3' для получени информации о коробке");
        System.out.println("Введите '4' если хотите положить или убрать предмет в коробку");
    }

    private static void runBoxAction(Scanner scanner, Box myBox) {
        printBoxMenu();
        int subChoice = scanner.nextInt();
        switch (subChoice) {
            case 1:
                System.out.println("Напишите 'Открыть' или 'Закрыть' коробку");
                String boxOpen = scanner.next();
                if (boxOpen.equals("Открыть")) {
                    myBox.setBoxStatus(true);
                    System.out.println("Вы открыли коробку");

                } else if (boxOpen.equals("Закрыть")) {
                    myBox.setBoxStatus(false);
                    System.out.println("Вы закрыли коробку");
                } else {
                    System.out.println("Неверное действие");
                }
                break;
            case 2:
                System.out.println("Напишите какой будет цвет у коробки");
                String changeColor = scanner.next();
                myBox.setColor(changeColor);
                System.out.println("Цвет изменен на : " + changeColor);
                break;
            case 3:
                myBox.printBoxInfo();
                break;
            case 4:
                System.out.println("Напишите 'Положить' или 'Убрать' предмет из коробки");
                String putItem = scanner.next();
                if (myBox.getBoxStatus() == true) {
                    if (putItem.equals("Положить")) {
                        if (myBox.getItem() == null) {
                            System.out.println("Введите название предмета");
                            String itemName = scanner.next();
                            myBox.setItem(itemName);
                            System.out.println("Вы положили "  + itemName + " в коробку");
                        } else {
                            System.out.println("Коробка уже заполнена");
                        }
                    }
                    else if (putItem.equals("Убрать")) {
                        if (myBox.getItem() != null) {
                            String deleteItem = myBox.getItem();
                            System.out.println("Вы убрали " + deleteItem + " из коробки");
                            myBox.setItem(null);
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
                break;
        }
    }
}