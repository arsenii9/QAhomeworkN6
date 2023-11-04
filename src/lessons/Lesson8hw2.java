package lessons;

public class Lesson8hw2 {
    public void doSomething() {
        System.out.println("Я пустой");
    }

    public void doSomething(String s) {
        System.out.println(s);
    }

    public void doSomething(int[] ints) {
        int sum = 0;

        for (int number : ints) {
            sum += number;
        }

        System.out.println(sum);
    }

    public void doSomething(int integer, String astring) {
        System.out.println("Ваше сообщение - " + astring);
        System.out.println("Ваше число " + integer);
    }
}
