package com.telusko.basic;

public class PrimitiveDataTypes
{
    public static void main(String [] args)
    {
        // before we talked about int, float, double
        int integer_number = 5;     // 4 bytes
        short short_int_number = 4;     // 2 bytes ( 16bits [-32768 to 32767] )
        byte byte_int_number = 7;       // 1 byte ( 8bits [-128 to 127] )
        long long_number = 5_000_000_000L;     // you need to add the L or l add the end

        float float_number = 54.23f;    // by default double, so you need to use F or f
        float float_number_1 = 23.324F;
        System.out.println(float_number_1);

        double double_number = 45.4664;

        // for characters
        char character = 'a';   // with this you can have a one character here
        System.out.println("char a : " + character);
        character = 66;     // this will get the ASCII value of this number
        System.out.println("char 66 : " + character);
        character = 6400;
        System.out.println("char 6400 : " + character);
        System.out.println("char 6400 : " + (int)character);

        // you can assign an integer value to a double variable ( implicit conversion )
        double int_number = 45;
        float int_number1 = 456f;
        System.out.println(int_number);
        System.out.println(int_number1);

        // to assign a float value to an integer variable you need to type casting it
        int type_cast_float = (int)5.9;  // you will get 5 (only the integer number)
        System.out.println(type_cast_float);


    }

}
