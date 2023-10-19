package lessons;

import java.util.Scanner;

public class lesson4hw1 {
    public static void main(String[] args) {
        System.out.println("Task1");
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " +  scanner.next() + " " +  scanner.next();

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println("string4: " + string4);
    }
}
