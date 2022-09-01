package com.telusko.basic;

// you can have multiple constructors with the same name,
// but you have to change the signature of those
// this is called as constructor overloading
class CasioCalc
{
    int num1;
    int num2;
    int result;
    String operation;
    public CasioCalc()
    {
        num1 = 0;
        num2= 0;
        operation = "Nothing";
    }

    public CasioCalc(int num1)
    {
        this.num1 = num1;
        num2= 0;
        operation = "Nothing";
    }

    public CasioCalc(int num1, int num2)
    {
        this.num1 = num1;
        this.num2= num2;
        operation = "Nothing";
    }

    public CasioCalc(int num1, int num2, String string)
    {
        this.num1 = num1;
        this.num2= num2;
        operation = string;
    }
}


public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        CasioCalc casio_calc = new CasioCalc();
        System.out.println(casio_calc.num1);
        System.out.println(casio_calc.num2);
        System.out.println(casio_calc.operation);
        System.out.println();

        CasioCalc casio_calc_1 = new CasioCalc(45);
        System.out.println(casio_calc_1.num1);
        System.out.println(casio_calc_1.num2);
        System.out.println(casio_calc_1.operation);
        System.out.println();

        CasioCalc casio_calc_2 = new CasioCalc(65,46);
        System.out.println(casio_calc_2.num1);
        System.out.println(casio_calc_2.num2);
        System.out.println(casio_calc_2.operation);
        System.out.println();

        CasioCalc casio_calc_3 = new CasioCalc(100,80,"ginura");
        System.out.println(casio_calc_3.num1);
        System.out.println(casio_calc_3.num2);
        System.out.println(casio_calc_3.operation);
        System.out.println();
    }
}
