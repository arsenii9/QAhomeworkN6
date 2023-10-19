package lessons;

import java.util.Scanner;

public class lesson4hw3 {
    public static void main(String[] args) {
        System.out.println("ВВедите два числа чтобы получить их разницу.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x - y;

        if (z > 0){
        System.out.println(z);}
        else if (z < 0){
         System.out.println(-z);



        }






    }
}
