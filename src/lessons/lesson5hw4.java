package lessons;

import java.util.Scanner;

public class lesson5hw4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индексы для имени, времени и места (через пробел): ");
        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();

        if (nameIndex >= 0 && nameIndex < names.length &&
                timeIndex >= 0 && timeIndex < times.length &&
                placeIndex >= 0 && placeIndex < places.length) {
            System.out.println(names[nameIndex] + " будет идти в " + places[placeIndex] + " в " + times[timeIndex] + ":00");
        } else {
            System.out.println("Некорректные индексы.");
        }
    }
}
