package com.telusko.basic;

public class ArithmeticOperators {
    /*
    Arithmetic
    Bitwise
    Relational
    Logical
     */

    // Let's start with arithmetic operators
    // +, -, *, /, %
    public static void main(String [] args){
        int number_1 = 12;
        int number_2 = 20;
        // int number_1 = 12 , number_2 = 20;

        // Addition Operator
        int addition_1_2 = number_1 + number_2;
        System.out.println(addition_1_2);

        // Subtraction Operator
        int subtraction_1_2 = number_1 - number_2;
        System.out.println(subtraction_1_2);

        // Multiplication Operator
        int multiplication_1_2 = number_1 * number_2;
        System.out.println(multiplication_1_2);

        // Division Operator
        // this will always give you only the quotient ( not the decimal values )
        // 5 / 2 will give 2 ( not  2.5 )
        int division_2_1 = number_2 / number_1;     // 12 / 20 will give 0
        System.out.println(division_2_1);

        // this will also give the 2 (not 2.5)
        int number_3 = 5;
        int number_4 = 2;
        double division_3_4 = number_3 / number_4;
        System.out.println(division_3_4);
        System.out.println();


        // to get the correct value you need to cast it to the double
        double number_5 = 5;
        double number_6 = 2;
        double division_5_6 = number_5 / number_6;
        System.out.println(division_5_6);

        // or like this
        int number_7 = 5;
        int number_8 = 2;
        double division_7_8 = (double)number_7 / number_8;
        System.out.println(division_7_8);
        System.out.println();

        // if you want the remainder part
        int remainder_7_8 = number_7 % number_8;
        System.out.println(remainder_7_8);
        System.out.println();
    }
}
