package com.telusko.basic;

import java.util.Scanner;

public class Ternary_SelectionStatement {
    public static void main(String[] args) {

// Normal Method
        int i = 6;
        int j = 0;
        // Let's check if the value of i is greater than 6
        // if it is true I want to assign the value of j as 1
        // else I want to assign the value of j as 2

        if (i > 6)
            j = 1;
        else
            j = 2;
        System.out.println(j);


        /*
         ! Ternary Method
            with the ternary type we can replace this code with one line
         * Ternary Operator
            *  ?: condition?expression1:expression2
          if the condition is true it will execute the expression 1
          if it is false it will execute the expression 2
         */
        int a = 9;
        int b = 0;

        // I want to assign the value of b
        // if a is greater than 8 , 5 will assign to the b
        // if a is lower than 8 ( condition is false ) , 10 will assign to the b

        b =  a > 8 ? 5: 10;
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number count: ");
        int count = scanner.nextInt();
        while(count != 0)
        {
            System.out.print("Enter your number  : ");
            int number = scanner.nextInt();
            // ! Variable = Condition? Expression1:Expression2
            String answer = number % 2 == 1 ? "Odd": "Even";
            count--;
            System.out.println(number + " is an " + answer);
        }

        System.out.print("Enter a boolean : ");
        boolean trueOrFalse = scanner.nextBoolean();
        Object obj1;
        if(trueOrFalse)
            obj1 = new Integer(10);
        else
            obj1 = new Double(15.6);

        System.out.println(obj1);


        System.out.print("Enter a boolean 2 : ");
        boolean trueOrFalse2= scanner.nextBoolean();
        Object obj2;

        //* even if it's true this will print 10.0
        /*
        ! because ternary operator will check type of the both the values and whichever
        ! is maximum it will occupy that type
        ! Hence, by default obj2 will be double
        */

        obj2=trueOrFalse2?new Integer(10):new Double(15.6);
        System.out.println(obj2);

    }
}
