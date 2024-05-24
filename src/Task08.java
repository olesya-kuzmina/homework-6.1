import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание: 8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        char[] array = generateRandomArray(n);
        printArray(array);

        int[] letterCountArray = countLetters(array);
        printFrequentLetters(letterCountArray, 3);
    }

    private static char[] generateRandomArray(int n) {
        char[] array = new char[n];
        for (int i = 0; i < n; i++) {
            array[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        }
        return array;
    }

    private static void printArray(char[] array) {
        System.out.print("Массив: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static int[] countLetters(char[] array) {
        int[] letterCountArray = new int[26];
        for (char c : array) {
            letterCountArray[c - 'a']++;
        }
        return letterCountArray;
    }

    private static void printFrequentLetters(int[] letterCountArray, int threshold) {
        System.out.print("Буквы, которые встречаются больше " + threshold + " раз: ");
        for (int i = 0; i < letterCountArray.length; i++) {
            if (letterCountArray[i] > threshold) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
        System.out.println();

    }
}
