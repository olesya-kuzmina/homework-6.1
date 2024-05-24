import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = generateRandomArray(n);
        System.out.print("Исходный массив: ");
        printArray(array);

        int wordCount = countWords(array);
        System.out.println("Общее количество слов в массиве: " + wordCount);
    }

    private static String[] generateRandomArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = generateRandomWord();
        }
        return array;
    }

    private static String generateRandomWord() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int wordLength = (int) (Math.random() * 10) + 1;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            int randomIndex = (int) (Math.random() * alphabet.length());
            char randomChar = alphabet.charAt(randomIndex);
            word.append(randomChar);
        }
        return word.toString();
    }

    private static void printArray(String[] array) {
        for (String word : array) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static int countWords(String[] array) {
        int wordCount = 0;
        for (String word : array) {
            wordCount += word.split(" ").length;
        }
        return wordCount;
    }
}
