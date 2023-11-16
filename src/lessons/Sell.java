package lessons;

import java.util.Random;

public class Sell implements ShopIntr {


    @Override
    public boolean honest() {
        Random random = new Random();
        int a = random.nextInt(2);
        if (a<1){
            boolean honest = true;
            return honest;
        }
        else {boolean honest1 = false;
       return honest1;
        }

    }
    public boolean alcohol(){
        Random random = new Random();
        int b = random.nextInt(2);
        if (b<1){boolean alcohol = true;
        return alcohol;
        }
        else {boolean alcohol1 = false;
        return alcohol1;
        }
    }

    public static void main(String[] args) {
        Sell sell = new Sell();
        sell.honest();
    }
}



