package lessons;

public class lesson3hw {
    public static void main(String[] args) {
        System.out.println("Task One:");
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        int numberString1 = string1.length();
        System.out.println(numberString1);
int string12 = string1.length();
        String string2 = (string1.substring( 0,string12 - 15));
        System.out.println(string2 );
        int numberString2 = string2.length();
        System.out.println(numberString2);
        String string3 = string2 + "it is perfect.";
        System.out.println(string3);
        int numberString3 = string3.length();
        System.out.println(numberString3);
        System.out.println("===========================================");
        System.out.println("Task Two: ");
        String test = "Testing, is my favourite job";
        String test2 = test.substring(0,7);
        String test3 = test.substring(9,11);
        String test4 = test.substring(12,14);
        String test5 = test.substring(15,24);
        String test6 = test.substring(25,28);

        int test22 = test2.length();
        int test33 = test3.length();
        int test44 = test4.length();
        int test55 = test5.length();
        int test66 = test6.length();

        System.out.println("Cлово1 = " + test2  +  " Длина этого слова = " + test22);
        System.out.println("Cлово2 = " + test3  +  " Длина этого слова = " + test33);
        System.out.println("Cлово3 = " + test4  +  " Длина этого слова = " + test44);
        System.out.println("Cлово4 = " + test5  +  " Длина этого слова = " + test55);
        System.out.println("Cлово5 = " + test6  +  " Длина этого слова = " + test66);

        boolean tf = test22 > test33 & test22 > test44 & test22 >test55 & test22 > test66;
        System.out.println("==========");
        System.out.println(tf);

    }
}
