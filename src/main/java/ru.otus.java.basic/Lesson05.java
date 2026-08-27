package ru.otus.java.basic;

import java.util.Scanner;

public class Lesson05 {

    public static void main(String[] args) {
        int[] array = {10, 1, 4, 6, 7, 8};
        Scanner console = new Scanner(System.in);
        int methodNum = console.nextInt();
        switch (methodNum) {
            case 1:
                System.out.println("Введите число: ");
                int number = console.nextInt();
                System.out.println("Введите слово: ");
                String word = console.next();
                printStringMultiple(number, word);
                break;
            case 2:
                printSumOfElementsGreaterThanFive(array);
                break;
            case 3:
                System.out.println("Введите число: ");
                int number1 = console.nextInt();
                fillArrayWithNumber(number1, array);
                break;
            case 4:
                System.out.println("Введите число: ");
                int number2 = console.nextInt();
                addNumberToArray(number2, array);
                break;
            case 5:
                compareAndPrintArrayHalves(array);
                break;
            default:
                System.out.println("Ничего не выбрано");
        }
    }

    public static void printStringMultiple(int number, String word) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    public static void printSumOfElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayWithNumber(int number1, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number1;
            System.out.print(array[i] + " ");
        }
    }

    public static void addNumberToArray(int number2, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number2;
            System.out.print(array[i] + " ");
        }
    }

    public static void compareAndPrintArrayHalves(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sumLeft += array[i];
        }
        for (int b = array.length / 2; b < array.length; b++) {
            sumRight += array[b];
        }
        if (sumLeft >= sumRight) {
            System.out.println(sumLeft);
        } else {
            System.out.println(sumRight);
        }
    }
}
