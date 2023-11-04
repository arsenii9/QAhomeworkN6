package lessons;

public class Lesson8hw1 {
    public void (int [] arrayOfIntegers){
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            printEvenOddNumbers(numbers);
        }

        public static void printEvenOddNumbers(int[] numbers) {
            System.out.println("Четные числа:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();

            System.out.println("Нечетные числа:");
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }
}
