package com.telusko.comparableAndComparator;

public class Laptop implements Comparable<Laptop>
{
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
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

    @Override
    public int compareTo(Laptop laptop2){
        // * Problem here is you are passing only one object how can you pass 2 objects
        /*
            * compareTo is method of Laptop class and so to call compareTo method you need a Laptop method
            * so That means by default you have an object which is calling compareTO
            * and you also have one more object which is getting passed
            * In total there are two objects which are acting here

            ? How do we access an object which you are calling
            * we use this keyword

            ? How do you compareTo these two objects
            * So, Compare to says you just need to return me some values
            * ( maybe a positive value or a negative value or just zero )
            * if first object > second object you returned a positive number
            * if first object < second object you returned a negative number
            * if first object = second object you returned zero

            ? Now which parameter to you want to sort
            * Let's say you want to sort laptop based on ram

         */

        if (this.getRam() > laptop2.getRam())
            return 1;
        else if (this.getRam() == laptop2.getRam())
            return 0;
        else
            return -1;
    }

}
