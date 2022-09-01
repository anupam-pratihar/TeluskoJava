package com.telusko.basic;

public class PrintfMethod
{
    public static void main(String [] args)
    {
        // System is a class
        // out is an object
        // println is a method
        System.out.println("Hello World");

        int number_1 = 12;
        int number_2 = 22;
        int number_3 = number_1 + number_2;

        System.out.println(number_3);
        System.out.println("The addition is " + number_3);
        System.out.println("The addition of " + number_1 + " and " + number_2 +" is "+ number_3);
        System.out.println();

        // printf means print format
        System.out.printf("The addition of %d and %d is %d",number_1,number_2,number_3 );
        // * More Details
        // https://www.baeldung.com/java-printstream-printf


    }
}
