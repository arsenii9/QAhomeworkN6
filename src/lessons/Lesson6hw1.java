package lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson6hw1 {
    public static void main(String[] args) {
        Random random = new Random( );
        int random2 = random.nextInt(101);
        String[] abc = new String[2];
        abc [0] = "Tell your name please" ;
        abc [1] = "Let the game begin!";
        System.out.println(abc[0]);
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println(abc[1]);
        while (true){
            String[] abcd = new String[2];
            abcd [0] = "Your number is too small. Please, try again...";
            abcd [1] =  "Your number is too big. Please, try again...";
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (random2 > answer){
                System.out.println(abcd[0]);
            }
            else if (random2 < answer){
                System.out.println(abcd[1]);
            }
            else {
                System.out.println("Congratulations, " + name + "!");
            }


            }






}

    }

