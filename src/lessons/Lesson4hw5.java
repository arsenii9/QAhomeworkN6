package lessons;

import java.util.Scanner;

public class Lesson4hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, %, /, *): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        // Используем оператор switch для выполнения соответствующей операции
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Неправильный оператор. Введите только +, -, %, / или *.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
