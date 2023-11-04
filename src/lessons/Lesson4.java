package lessons;

public class Lesson4 {
    /*     "Повседневная практика показывает,
     что разбавленное изрядной долей эмпатии
     , рациональное мышление выявляет срочную потребность глубокомысленных рассуждений
     . Раздел 16."*/
    public static void main(String[] args) {
        String string1 = "Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет срочную потребность глубокомысленных рассуждений. Раздел 16.";
      int stringLenght = string1.length();
        System.out.println(stringLenght);
        System.out.println( string1.split("\\s").length);
        System.out.println( string1.split("\\s")[2].replace(",","") + " " +  string1.split("\\s"));
        String[] string2 = string1.split("\\s");
        int string2Lenght = string2.length;
        System.out.println(string2[string2Lenght  - 1]);
    }
}
