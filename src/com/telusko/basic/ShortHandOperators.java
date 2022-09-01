package com.telusko.basic;

// Short Hand Operators += , -= , *= ...
public class ShortHandOperators {
    public static void main(String [] args){
        int number_1 = 5;
        int number_2 = 2;

        // same as the number_1 = number_1 + number_2
        number_1 += number_2;
        System.out.println(number_1);

        number_1 += 10;
        System.out.println(number_1);

        number_1 -= 10;
        System.out.println(number_1);

        number_1 *= 2;
        System.out.println(number_1);

        byte byte_number = 8;
        // byte_number = byte_number * 2,5;  <- this will give you an error
        byte_number *= 2.5;
        // if you have (expression1 operator expression2) your answer operator will be expression1 type
        System.out.println(byte_number);


        System.out.println();
        // shorthand operators (increment operator)
        number_1 ++; // same as (number_1 += 1) and (n
        // number_1 = number_1 + 1)
        System.out.println(number_1);

        // Decrement operator
        number_1 --;
        System.out.println(number_1);
        System.out.println();




    }
}
