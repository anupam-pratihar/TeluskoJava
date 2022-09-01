package com.telusko.basic;

public class WorkingWithVariables {
    public static void main(String[] args){
        // first you need to define the data type then the variable name and the value
        // you can use dollar sign and the underscore
        // first character cannot be a number
        int a = 5;
        int abc_ = 46;      // 4 bytes -> 32 bits
        int $number = 456;
        System.out.println(a);
        System.out.println(abc_);
        System.out.println($number);

        // once you define a variable you can change the value later
        abc_ = 45643;
        System.out.println(abc_);


        // if you want to assign a float value you need to use double or float
        // default type for the floating point numbers is double
        float float_number = 45.5F;     // 4 bytes
        System.out.println(float_number);
        double double_number = 42.564;  // 8 bytes
        System.out.println(double_number);

    }
}
