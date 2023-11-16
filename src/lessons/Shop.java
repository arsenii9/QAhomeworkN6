package lessons;

import java.util.Scanner;

public class Shop {
    private String nameOfShop;
    private double price;
    private String nameOfBuy;
    private String nameOfSell;
    private int ageOfBuy;
    private String nameOfProduct;

    public String getNameOfShop() {
        return nameOfShop;
    }

    public double getPrice() {
        return price;
    }

    public String getNameOfBuy() {
        return nameOfBuy;
    }

    public String getNameOfSell() {
        return nameOfSell;
    }

    public int getAgeOfBuy() {
        return ageOfBuy;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNameOfBuy(String nameOfBuy) {
        this.nameOfBuy = nameOfBuy;
    }

    public void setNameOfSell(String nameOfSell) {
        this.nameOfSell = nameOfSell;
    }

    public void setAgeOfBuy(int ageOfBuy) {
        this.ageOfBuy = ageOfBuy;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
public void scan(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите название магазина:");
    nameOfShop = scanner.nextLine();
    System.out.println("Введите цену товара:");
    price = scanner.nextInt();
    System.out.println("Введите имя покупателя:");
    nameOfBuy = scanner.nextLine();
    System.out.println("Введите имя продавца:");
    nameOfSell = scanner.nextLine();
    System.out.println("Введите возраст покупателя:");
    ageOfBuy = scanner.nextInt();
    System.out.println("Введите название товара:");
    nameOfProduct= scanner.nextLine();
}
    @Override
    public String toString() {
        return "Shop{" +
                "nameOfShop='" + nameOfShop + '\'' +
                ", price=" + price +
                ", nameOfBuy='" + nameOfBuy + '\'' +
                ", nameOfSell='" + nameOfSell + '\'' +
                ", ageOfBuy=" + ageOfBuy +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }

    public void toSell() {
        Sell honest = new Sell();
        if ((ageOfBuy < 18) && (honest.honest() == true)) {
            System.out.println("Я не могу вам этого продать.");

        } else {
            Buy b = new Buy();
            if (b.have() == false) {
                System.out.println("Возьмите, с вас " + price + "гривен");
            }else {
                Buy buy = new Buy();
                System.out.println("Возьмите, с вас " + buy.card(price) + "гривен");
            }

        }


    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.scan();
    }
}



