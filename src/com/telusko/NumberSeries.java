package com.telusko;

public class NumberSeries
{
    public static void main(String[] args)
    {
        System.out.println("\n Fibonacci Series");
        int end = 10;
        int temp = 1;
        int temp_2 = 0;
        int number = 0;
        System.out.print(1 + " ");
        for(int outer_index = 1; outer_index < end; outer_index++)
        {
            number =  temp + temp_2;
            System.out.print(number + " ");
            temp_2 = temp;
            temp = number;
        }
    }
}
