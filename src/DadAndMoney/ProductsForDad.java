package DadAndMoney;

public enum ProductsForDad {
   APPLE("APPLE", 1), MILK("MILK", 6), POTATO("POTATO", 3), BEER("BEER", 1), TOBACCO("TOBACCO", 9);
    private String name;
    private int countOfProducts;
    private int priceForOne;

    ProductsForDad(String name, int countOfProducts) {
        this.name = name;
        this.countOfProducts = countOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public void setCountOfProducts(int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }



 public int price (int amount , int priceForOne){
    this.countOfProducts = amount;
    this.priceForOne = priceForOne;
    int a =  amount*priceForOne;
    return a;


}

}
