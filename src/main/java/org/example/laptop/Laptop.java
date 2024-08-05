package org.example.laptop;

public class Laptop {

    private String brand; // бренд ноутбука
    private int ram; //  объем оперативной памяти GB
    private int storage; //  объем хранилища GB
    private String os; // название операционной системы
    private double price; // цена

    public Laptop(String brand, int ram, int storage, String os, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public String getOs() {
        return os;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}


