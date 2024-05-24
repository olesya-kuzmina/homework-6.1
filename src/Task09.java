import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание №9:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] array = generateRandomArray(n);
        System.out.print("Исходный массив: ");
        printArray(array);

        if (hasNegativeLessThanMinusOne(array)) {
            array = squareNegativeValues(array);
        }

        System.out.print("Результирующий массив: ");
        printArray(array);
    }

    private static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 3)) - 2;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static boolean hasNegativeLessThanMinusOne(int[] array) {
        for (int value : array) {
            if (value < -1) {
                return true;
            }
        }
        return false;
    }

    private static int[] squareNegativeValues(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[i] = array[i] * array[i];
            } else {
                result[i] = array[i];
            }
        }
        return result;
    }
}
