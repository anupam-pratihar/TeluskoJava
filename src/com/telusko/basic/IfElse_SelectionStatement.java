package com.telusko.basic;

public class IfElse_SelectionStatement {
    public static void main(String[] args){
        // we can use if
        // or switch
        // or ternary

        int number_1 = 0;

        // to get it is even or odd
        if (number_1 == 0)
            System.out.println(number_1 + " is not an Even or an Odd number");
        else
            if (number_1 % 2 == 0)
                System.out.println(number_1 + " is an Even number");
            else
                System.out.println(number_1 + " is an Odd number");

        System.out.println();

        int number_2 = 22;

        // in java if is only for focus on a one statement
        // if you are going to use more than 1 statement use {} for the if statement
        if (number_2 == 0) {
            System.out.println(number_2 + " is not an Even or an Odd number");
            System.out.println("All good!");
        }

        else if (number_2 % 2 == 0)
        {
            System.out.println(number_2 + " is an Even number");
            System.out.println("All good!");
        }

        else
        {
            System.out.println(number_2 + " is an Odd number");
        }


        System.out.println();
        // bitwise AND(&)
        // logical AND(&&)
        String number1 = "ginura";
        String number2 = "ginura";

        if (number1 == number2 && number1 == "ginura")
            System.out.println("Everything is good!");
        else
            System.out.println("Something is wrong!");
    }
}
