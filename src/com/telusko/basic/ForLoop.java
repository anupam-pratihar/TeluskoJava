package com.telusko.basic;

public class ForLoop
{
    public static void main(String[] args)
    {
        for(int i = 0; i<5 ; i++)
        {
            System.out.println((i + 1) + " Hello");
        }
        System.out.println();

        // to print odd numbers 0 to 100
        for (int number = 1; number < 100; number+=2)
            System.out.println(number);
    }
}
