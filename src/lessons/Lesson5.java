package lessons;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
       /* 4)Пользователь вводит слово с клавиатуры, оно выводится в консоль таким образом, что каждый символ
        выводится через пробел. Используем для этого цикл for.
        Пример: пользователь ввел слово "Картина", в консоль выводится "К а р т и н а"
    }*/
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int integer = string.length();
        for (int i = 0 ; i < integer ; i++){

            System.out.print(string.charAt(i) +  " ");



        }
    }

        }


