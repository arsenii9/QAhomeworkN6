package lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Пользовательское исключение для ArrayIndexOutOfBoundsException
class ArrayIndexException extends Exception {
    public ArrayIndexException(String message) {
        super(message);
    }
}

// Пользовательское исключение для ArithmeticException
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Array {
    public double array() throws ArrayIndexException, DivideByZeroException {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int rr = r.nextInt(1, 31);
        double[] a = new double[rr];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(31);
        }

        System.out.println(Arrays.toString(a));

        int k = scanner.nextInt();

        if (k < 0 || k >= a.length) {
            throw new ArrayIndexException("Index out of bounds");
        }

        if (a[0] == 0) {
            throw new DivideByZeroException("Division by zero");
        }

        double c = a[k];
        double result = c / a[0];

        System.out.println(result);
        return result;
    }


    }



