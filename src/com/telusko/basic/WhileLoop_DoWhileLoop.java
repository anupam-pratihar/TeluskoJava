package com.telusko.basic;

public class WhileLoop_DoWhileLoop {
    public static void main(String[] args)
    {
        // if you want to print something 5 times
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println();

        // Don't repeat like above
        // you can use
        // while loops
        // do while loops
        // for loops
        // for-each loop ( enhanced for loop)

        // while loop
        int count = 0;
        while(count < 5)
        {
            System.out.println("Hello");
            count ++;
        }
        System.out.println();

        // do while loop
        // (when you are getting an input from the user)
        // if you want to execute the block at least once even if your condition is false, use do while
        int do_count = 6;       // even if you use greater than 5 value hello will print at least once
                                // because condition is checked later
        do
        {
            System.out.println("Hello");
            do_count ++;
        } while ( do_count < 5);
    }
}
