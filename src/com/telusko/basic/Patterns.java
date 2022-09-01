package com.telusko.basic;

public class Patterns {
    public static void main(String[] args)
    {
        /**
         * 1 2 3 4
         * 2 3 4 1
         * 3 4 1 2
         * 4 1 2 3
         */


        System.out.println("\n First Pattern");
        for(int outer_index=1; outer_index < 5; outer_index++)
        {
            int count = outer_index;
            for(int inner_index=1; inner_index < 5; inner_index++)
            {
                if(count > 4)
                {
                    count = 1;
                }
                System.out.print(count+ " ");
                count ++;
            }
            System.out.println();
        }

        System.out.println("\n Second Pattern");
        for(int outer_index = 0; outer_index < 5; outer_index++)
        {
            for(int inner_index = 0; inner_index < outer_index+1; inner_index++)
            {
                System.out.print( (outer_index + inner_index + 1) % 2 + " ");
            }
            System.out.println();
        }

        System.out.println("\n Third Pattern");
        for(int outer_index = 1; outer_index < 6; outer_index++)
        {
            for(int inner_index = 0; inner_index < outer_index; inner_index++)
            {
                System.out.print(outer_index+ " ");
            }
            System.out.println();
        }

    }
}
