package lessons;

import java.util.Scanner;

public class Lesson5hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[100]; // Максимальное количество слов, которое может быть в предложении
        int wordCount = 0;

        System.out.println("Введите слова (для завершения введите 'STOP'):");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            words[wordCount] = word;
            wordCount++;
        }

        System.out.print("Ваше предложение: ");

        for (int i = 0; i < wordCount; i++) {
            System.out.print(words[i] + " ");
        }

        scanner.close();
    }

}
