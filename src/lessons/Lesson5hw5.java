package lessons;

import java.util.Scanner;

public class Lesson5hw5 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 10, 15, 23, 45, 60, 77, 99};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для поиска: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число найдено в массиве.");
        } else {
            System.out.println("Число не найдено в массиве.");

    }
}
}

