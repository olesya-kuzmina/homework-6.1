import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание №10:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] array = generateRandomArray(n);
        System.out.print("Исходный массив: ");
        printArray(array);

        int index = findDivisibleElement(array);
        System.out.println("Индекс элемента, который делится без остатка на элементы слева и справа: " + index);
    }

    private static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 34);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int findDivisibleElement(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                return i;
            }
        }
        return -1;
    }
}
