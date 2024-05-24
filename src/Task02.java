public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание №2: ");
        int[] array = new int[30];
        int min = 50;
        int max = -70;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (50 - (-70) + 1)) + (-70);
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

    }
}
