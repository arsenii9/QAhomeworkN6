package lessons;

import java.util.Random;

public class Buy {
    public boolean have(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a<1){
            boolean b = true;
            return b;
        }else {
            boolean b = false;
            return b;
        }
    }
    public double card(double price) {
        price = price - price / 10;
        System.out.println(price);
        return price;

    }

}
