public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3: ");
        int[] array = {1, 1, 1, 2, 1};

        boolean allValues = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                allValues = false;
                break;
            }
        }

        if (allValues) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
