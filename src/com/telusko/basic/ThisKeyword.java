package com.telusko.basic;

class Calculators
{
    int number_1;
    int number_2;
    int result;

    public Calculators(int number_1, int number_2)
    {
        // numb_1 and numb_2 are local variables
        // when you change them to number_1 and number_2
        // now local variable is shadowing the instance variable
        // but if you want to specify that 1st number_1 and number_2 are not local variables
        // those are instance variables use this.variable_name

        this.number_1 = number_1; // this. will specify these are not local these are instance variables
        this.number_2 = number_2;
        // when you have the local variable and the instance variable with same name
        // with the help of this.variable_name you can refer to instance variable



        // number_1 and number_2 is actually used by below object
        // belongs to the calc_object
        // if you create another object there will be 2 instance of number 1 and number 2
    }
}

public class ThisKeyword
{
    public static void main(String[] args)
    {
        Calculators calc_object = new Calculators(4,5);  // Constructor
        System.out.println(calc_object.number_1);
        System.out.println(calc_object.number_2);
    }

}
