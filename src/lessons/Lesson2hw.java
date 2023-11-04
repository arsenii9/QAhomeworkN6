package lessons;

public class Lesson2hw {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        System.out.println("До обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Обмен значений a и b
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
