package ru.otus.java.basic;

import java.util.Scanner;

public class Lesson07 {

    private static final int[][] array = {{1, 2, 3}, {-1, 4, 6}, {-7, 8, 9}};
    private static final int SIZE = 5;
    private static final char[][] map = new char[SIZE][SIZE];
    private static final char STAR_EMPTY = '*';

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int methodNum = console.nextInt();
        switch (methodNum) {
            case 1:
                sumOfPositiveElements(array);
                break;
            case 2:
                printSquare(SIZE);
                ;
                break;
            case 3:
                zeroDiagonal(array);
                ;
                break;
            case 4:
                findMax(array);
                break;
            case 5:
                sumSecondRow(array);
                break;
            default:
                System.out.println("Ничего не выбрано");
        }
    }

    public static void sumOfPositiveElements(int[][] arr) {
        int maxSum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (arr[x][y] > 0) {
                    maxSum += arr[x][y];
                }
            }
        }
        System.out.println("Сумма положительных: " + maxSum);
    }

    public static void printSquare(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                map[x][y] = STAR_EMPTY;
                System.out.print(map[x][y]);
            }
            System.out.println();
        }
    }

    public static void zeroDiagonal(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (x == y || x + y == array.length - 1) {
                    array[x][y] = 0;
                }
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (arr[x][y] > max) {
                    max = arr[x][y];
                }
            }
        }
        System.out.println("Максимум: " + max);
    }

    public static void sumSecondRow(int[][] arr) {
        int max = 0;
        if (arr[1].length != 0) {
            for (int x = 1; x < arr.length - 1; x++) {
                for (int y = 0; y < arr[x].length; y++) {
                    max += arr[x][y];
                }
            }
        }
        System.out.println(max);
    }
}