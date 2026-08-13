import java.util.Random;
import java.util.Scanner;

public class Lesson03 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        int methodNum = console.nextInt(6);
        switch (methodNum) {
            case 1:
                greetings();
                break;
            case 2:
                int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
                checkSign(a, b, c);
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNumbers();
                break;
            case 5:
                int initValue = random.nextInt();
                int delta = random.nextInt();
                boolean increment = random.nextBoolean();
                addOrSubtractAndPrint(initValue, delta, increment);
                break;
            default:
                System.out.println("Ничего не выбрано");
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        String summary = (a + b + c) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(summary);
    }

    public static void selectColor() {
        Random random = new Random();
        int data = random.nextInt(21);
        if (data < 10) {
            System.out.println("Красный");
        }
        if (data >= 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(), b = random.nextInt();
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
