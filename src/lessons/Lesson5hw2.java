package lessons;

import java.util.Scanner;

public class Lesson5hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Это число является палиндромом.");
        } else {
            System.out.println("Это число не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
