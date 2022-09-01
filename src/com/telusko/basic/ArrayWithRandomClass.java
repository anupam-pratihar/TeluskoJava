package com.telusko.basic;

import java.util.Random;

public class ArrayWithRandomClass
{
    public static void main(String[] args)
    {
        // array is a collection of elements
        Random random = new Random();
        int[] array = new int[50];
        for(int i=0; i<array.length; i++)
        {
            array[i] = random.nextInt(50);
        }

        for(int i:array)
        {
            System.out.print(i + " ");
        }

    }
}
