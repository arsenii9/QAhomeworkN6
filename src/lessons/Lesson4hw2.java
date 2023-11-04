package lessons;

import java.util.Scanner;

public class Lesson4hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны треугольника:");
        int side1 = scanner.nextInt();

        System.out.println("Введите длину второй стороны треугольника:");
        int side2 = scanner.nextInt();

        System.out.println("Введите длину третьей стороны треугольника:");
        int side3 = scanner.nextInt();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Можно построить треугольник.");
        } else {
            System.out.println("Нельзя построить треугольник с заданными сторонами.");
        }



    }
}
