package lessons;

import java.util.Scanner;

public class Calculator {

    public void summ(double a, double b) {
        double result = a + b;
        System.out.println("Answer: " + result);
    }

    public void minus(double a, double b) {
        double result = a - b;
        System.out.println("Answer: " + result);
    }

    public void multiply(double a, double b) {
        double result = a * b;
        System.out.println("Answer: " + result);
    }

    public void division(double a, double b) {
        double result = a / b;
        System.out.println("Answer: " + result);
    }

    public void start() {
        System.out.println("Калькулятор start");
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Insert action");
            action = scanner.nextLine();
            if (action.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор stop");
                break;
            } else if (action.contains("+")) { //1221+3131
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first, second);
            } else if (action.contains("*")) {
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first, second);
            } else if (action.contains("-")) {
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first, second);
            } else if (action.contains("/")) {
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first, second);
            } else {
                System.out.println("Inser another action");
            }
        } while (!action.equalsIgnoreCase("STOP")) ;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
