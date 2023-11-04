package lessons;

import java.util.Arrays;
import java.util.Random;

public class Lesson6 {
    /*Заполнить массив на 10 элементов случайными числами от 0 до 100.
    Вывести в консоль все значения данного массива.
    Найти минимальный элемент и вывести его на консоль.*/
    public static void main(String[] args) {
        int[] integer = new int[10];
        Random random = new Random();

       for (int i = 0; i < integer.length;i++){
integer[i] = random.nextInt(100);
       }
        System.out.println(Arrays.toString(integer));
        int min = integer[0];
        for (int i = 0; i < integer.length;i++){
            boolean b = min<integer[i];
            if (b == false ){
                min = integer[i];

            }
        }
        System.out.println(min);

    }
}
