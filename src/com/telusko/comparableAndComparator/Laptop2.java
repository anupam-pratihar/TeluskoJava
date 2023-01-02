package com.telusko.comparableAndComparator;

public class Laptop2
{
    private String brand;
    private int ram;
    private int price;

    public Laptop2(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [brands " + brand + ", rams " + ram + ", price= " + price + "]";
    }
}
