package lessons;

public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int gpu;

    public Computer(String brand, int price, int ram, int gpu) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getGpu() {
        return gpu;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Создан PC.\n" +
                "Имя = " + brand + ".\n" +
                "Цена = " + price + ".\n" +
                "Видеокарта = " + gpu + ".\n" +
                "ОЗУ = " + ram + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price &&
                ram == computer.ram &&
                gpu == computer.gpu &&
                brand.equals(computer.brand);
    }

    public static void main(String[] args) {

    }


    }









