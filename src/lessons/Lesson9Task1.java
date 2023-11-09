package lessons;

import java.util.Scanner;

public class Lesson9Task1 {

    /*  1)Написать метод, который будет спрашивать у пользователя ввести с клавиатуры предложение
        а после выводит в консоль из скольки слов состоит данное предложение.
        А также этот метод должен возвращать количество этих слов.*/
    public int str () {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string2 = string.split(" ");
        int i = string2.length;
        System.out.println(i);
        return i;


    }
}
