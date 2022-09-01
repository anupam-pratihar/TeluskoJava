package com.telusko.basic;

class Calculator
{
    int number_1;
    int number_2;
    int result; // instance variable

    public int perform(int extra, int prod) // local variable
    {
        result = (number_1 + number_2 + extra) * prod;
        if (result > 50)
            return result;
        else
            return result;
    }

    // let's create a constructor ( never return anything )
    public Calculator()
    {
        // this will print automatically when the object is created
        System.out.println("Changed default values from the Constructor ");
        number_1 = 5;
        number_2 = 5;
    }

    // you can have another constructor, but you have to change the signature
    // change the signature means change the parameters
    public Calculator(int n)
    {
        System.out.println("Second constructor");
        number_1 = n;
        number_2 = n;
    }

    // let's create another constructor to get double values
    public Calculator(double d)
    {
        System.out.println("Third Constructor(double)");
        number_1 = (int)d;
        number_2 = (int)d;
    }


}

public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Calculator calc_object = new Calculator(); // this is a constructor ( this will call the constructor )
        // the constructor that java gives you, does only a one thing, it allocates the memory

        System.out.println(calc_object.number_1);   // default values from constructor
        System.out.println(calc_object.number_2);
        System.out.println();

        calc_object.number_1 = 3;
        calc_object.number_2 = 5;
        System.out.println(calc_object.number_1);
        System.out.println(calc_object.number_2);
        int return_answer = calc_object.perform(2,3);
        System.out.println(return_answer);
        System.out.println();


        // to call the second constructor you need to pass a parameter
        Calculator constructor_demonstration = new Calculator(6);
        System.out.println(constructor_demonstration.number_1);
        System.out.println(constructor_demonstration.number_2);
        System.out.println();


        // to call the third constructor you need to pass a double value parameter
        Calculator constructor_double= new Calculator(9.505);
        System.out.println(constructor_double.number_1);
        System.out.println(constructor_double.number_2);


    }
}
