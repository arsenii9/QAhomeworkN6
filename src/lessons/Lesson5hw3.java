package lessons;

import java.util.Scanner;

public class Lesson5hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCapacity = 100; // Максимальная вместимость склада
        int currentCapacity = maxCapacity;

        while (currentCapacity > 0) {
            System.out.println("Склад может принять " + currentCapacity + " кг металла.");
            System.out.print("Введите вес металла для приема: ");
            int weight = scanner.nextInt();

            if (weight < 5) {
                System.out.println("Невозможно принять металл весом менее 5 кг.");
            } else if (weight > currentCapacity) {
                System.out.println("Недостаточно места на складе для приема этого металла.");
            } else {
                currentCapacity -= weight;
                System.out.println("Металл принят. Осталось места на складе: " + currentCapacity + " кг.");
            }
        }

        System.out.println("Склад заполнен. Программа завершена.");
    }
}
