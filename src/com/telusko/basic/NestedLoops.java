package com.telusko.basic;

/* print this pattern
*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *
 */
public class NestedLoops {
    public static void main(String[] args)
    {
        for (int outer_count = 0; outer_count < 4; outer_count++)
        {
            for (int inner_count = 0; inner_count < 4; inner_count++)
            {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println();

        // question 1
        for (int outer_number = 1; outer_number < 7; outer_number++)
        {
            for (int inner_number = 1; inner_number < (outer_number + 1); inner_number++)
            {
                System.out.print(inner_number + " ");
            }
            System.out.println();
        }

    }
}


// for (int count = 0; count < 4; count++)
// {
//     System.out.print("* * * * *");
//     System.out.println();
// }