package lessons;

import java.util.Random;

public class lesson5hw6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();

        // Заполнение массива случайными числами от -50 до +50
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        int min = array[0];
        int max = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
