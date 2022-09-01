package com.telusko.basic;

import java.util.Arrays;
import java.util.Random;

public class Array2D
{
    public static void main(String[] args)
    {
        int[] a = {40,6,4,0,64};
        int[] b = {5,10,0,10,50};
        int[] c = {54,10,21,1,3};
        //* instead of creating 3 arrays we can create one big array
        //? let's create a 2 dimensional array
        //? when the numbers of columns are fixed they are called normal Array
        int[][] array_2d =
                {
                    {40,6,4,0,64} ,
                    {5,10,0,10,50},
                    {54,10,21,1,3}
                };

        System.out.println(array_2d[0][1]);
        System.out.println();

        // to print the all the elements
        // outer loop for count the rows
        // inner loop for count the columns
        /*
                {40,6,4,0,64}
                {5,10,0,10,50}
                {54,10,21,1,3}
         */

        for (int i=0; i < 3;i++)    // rows
        {
            for(int j=0; j < 5; j++)    // columns
            {
                System.out.print(array_2d[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();


        //* when the numbers of columns are not fixed they are called Jagged Array
        int[][] array_2d_mix =
                {
                        {404,0,64},
                        {5,10,0,10,50,45,46,456},
                        {54,10,21,1,3}
                };

        for (int row_value=0; row_value < array_2d_mix.length; row_value++)    // rows
        {
            //* if we have a various number of elements for the 2nd or other array
            //* instead of j or i we can use the length of the array
            //* instead of -> for (int i=0; i < 3;i++) and for(int j=0; j < 5; j++)
            //* we can use -> for (int i=0; i < array_2d.length;i++) and for(int j=0; j < array_2d[i].length; j++)
            for(int column_value=0; column_value< array_2d_mix[row_value].length; column_value++)    // columns
            {
                System.out.print(array_2d_mix[row_value][column_value] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("array_2d_mix.length : " + array_2d_mix.length);
        System.out.println("array_2d_mix[1].length : " + array_2d_mix[1].length);
        System.out.println();


        int[][] exampleArray = new int[3][];
        exampleArray[0] = new int[4];
        exampleArray[1] = new int[2];
        exampleArray[2] = new int[3];
    }
}
