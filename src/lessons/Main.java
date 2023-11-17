package lessons;

public class Main {

        public static void main(String[] args) {
            Array arrayObj = new Array();

            try {
                arrayObj.array();
            } catch (ArrayIndexException e) {
                System.out.println("Caught ArrayIndexException: " + e.getMessage());
                e.printStackTrace();
            } catch (DivideByZeroException e) {
                System.out.println("Caught DivideByZeroException: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


