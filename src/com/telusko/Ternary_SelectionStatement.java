package com.telusko;

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


// Ternary Method
        // with the ternary type we can replace this code with one line
        // Ternary Operator
        // ?: condition?expression1:expression2
        // if the condition is true it will execute the expression 1
        // if it is false it will execute the expression 2
        int a = 9;
        int b = 0;
        // I want to assign the value of b
        // if a is greater than 8 , 5 will assign to the b
        // if a is lower than 8 ( condition is false ) , 10 will assign to the b
        b =  a > 8? 5: 10;
        System.out.println(b);
        

    }
}
