import java.util.Scanner;

public class lesson4hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x==1) {
            System.out.println("Понедельник");
        }
        else if (x==2){
            System.out.println("Вторник");
        } else if (x==3) {
            System.out.println("Среда");

        } else if (x==4) {
            System.out.println("Четверг");

        } else if (x==5) {
            System.out.println("Пятница");

        } else if (x==6) {
            System.out.println("Суббота");

        } else if (x==7) {
            System.out.println("Воскресенье");

        }
        else {
            System.out.println("Лучше бы сегодня была пятница.");
        }
    }
}
