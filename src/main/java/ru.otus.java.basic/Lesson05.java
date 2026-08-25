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
                methodOne(number, word);
                break;
            case 2:
                methodTwo(array);
                break;
            case 3:
                System.out.println("Введите число: ");
                int number1 = console.nextInt();
                methodThree(number1, array);
                break;
            case 4:
                System.out.println("Введите число: ");
                int number2 = console.nextInt();
                methodFour(number2, array);
                break;
            case 5:
                methodFive(array);
                break;
            default:
                System.out.println("Ничего не выбрано");
        }
    }

    public static void methodOne(int number, String word) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    public static void methodTwo(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > 5) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

    public static void methodThree(int number1, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number1;
            System.out.print(array[i] + " ");
        }
    }

    public static void methodFour(int number2, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number2;
            System.out.print(array[i] + " ");
        }
    }

    public static void methodFive(int[] array) {
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
