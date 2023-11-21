package DadAndMoney;

import java.util.Random;

public class Dad {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buy(ProductsForDad a, ProductsForDad b) {
        Random random = new Random();
        int m = random.nextInt(100);
        Dad dad = new Dad();
        dad.setName("Vasya");
        dad.setMoney(m);
        while (true) {
            if ((a.price(6, 7) + b.price(8, 77)) <= getMoney()) {
                if (a == ProductsForDad.BEER && b == ProductsForDad.TOBACCO) {
                    System.out.println("Oh no!");
                    break;
                } else if (a == ProductsForDad.TOBACCO && b == ProductsForDad.BEER) {
                    System.out.println("Oh no!");
                    break;
                } else {
                    if (a.getCountOfProducts() % 3 == 0 && b.getCountOfProducts() % 3 == 0) {
                        System.out.println("I can buy it");
                        break;
                    } else {
                        System.out.println("Oops");
                        break;
                    }
                }
            } else {
                System.out.println("Oh no!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Dad dad = new Dad();
        dad.buy(ProductsForDad.APPLE, ProductsForDad.BEER);
    }
}

