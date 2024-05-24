public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание №12:");
        int[] array = {1, 2, 3, 2, 1};

        boolean isSymmetric = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
