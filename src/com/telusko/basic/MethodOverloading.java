package com.telusko.basic;

// you can have multiple methods with the same name,
// but you have to change the signature of those
// this is called as method overloading
class Casio
{
    public void add(int num1, int num2)
    {
        System.out.println(num1 + num2);
    }

    public void add(int num1, int num2, int num3)
    {
        System.out.println(num1 + num2 + num3);
    }
    public void add(double num1, double num2)
    {
        System.out.println(num1 + num2);
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Casio casio_object = new Casio();
        casio_object.add(5, 2);
        casio_object.add(5, 2, 4);
        casio_object.add(5.5, 2.8);
    }
}
