package lessons;

import java.util.Random;
import java.util.Scanner;

public class lesson7hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос размерности двумерного массива у пользователя
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создаем двумерный массив и заполняем его случайными числами от 0 до 1000
        int[][] twoDimArray = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(1001); // случайное число от 0 до 1000
            }
        }

        // Создаем одномерный массив для максимальных значений
        int[] maxValuesArray = new int[twoDimArray.length];

        // Находим максимальное значение в каждом отдельном массиве (строке) и сохраняем его
        for (int i = 0; i < twoDimArray.length; i++) {
            int max = twoDimArray[i][0];
            for (int j = 1; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] > max) {
                    max = twoDimArray[i][j];
                }
            }
            maxValuesArray[i] = max;
        }

        // Выводим одномерный массив максимальных значений на экран
        System.out.println("Одномерный массив максимальных значений:");
        for (int i = 0; i < maxValuesArray.length; i++) {
            System.out.print(maxValuesArray[i] + " ");

        }
    }
}

