public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание №1: ");
        int[] fibonacciArray = new int[15];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < 15; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        for (int num : fibonacciArray) {
            if (num % 2 == 0) {
                System.out.print(num + "\t");
            }
        }
    }
}
