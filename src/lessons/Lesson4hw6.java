package lessons;

import java.util.Scanner;

public class Lesson4hw6 {
    public static void main(String[] args) {
        System.out.println("Просим вас вводить все названия с большой буквы!");
        System.out.println("Введите выбранную прогармму.");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        switch (string){
            case ("Java"):
                System.out.println("Введите выбранную операционную систему.");
                Scanner scanner1 = new Scanner(System.in);
                String string1 = scanner1.nextLine();
                if (string1.equals("Windows")){
                    System.out.println("https://www.java.com/ru/download/manual.jsp");}
               else if (string1.equals("Macos")){
                    System.out.println("https://www.java.com/ru/download/manual.jsp");}
               else if (string1.equals("Linux")){
                    System.out.println("https://www.java.com/ru/download/manual.jsp");}
            case ("Git"):
                System.out.println("Введите выбранную операционную систему.");
                Scanner scanner2 = new Scanner(System.in);
                String string2 = scanner2.nextLine();
                if (string2.equals("Windows")){
                    System.out.println("https://gitforwindows.org/");}
               else if (string2.equals("Macos")){
                    System.out.println("https://git-scm.com/download/mac");}
               else if (string2.equals("Linux")){
                    System.out.println("https://git-scm.com/download/linux");}
            case ("IntelliJ idea"):
                System.out.println("Введите выбранную операционную систему.");
                Scanner scanner3 = new Scanner(System.in);
                String string3 = scanner3.nextLine();
                if (string3.equals("Windows")){
                    System.out.println("https://www.jetbrains.com/idea/download/?section=windows");}
               else if (string3.equals("Macos")){
                   System.out.println("https://www.jetbrains.com/idea/download/?section=mac");}
               else if (string3.equals("Linux")){
                    System.out.println("https://www.jetbrains.com/idea/download/?section=linux");}
            default:
                System.out.println("Была допущена ошибка при введении названия программы или операционной системы");




        }
    }
}
