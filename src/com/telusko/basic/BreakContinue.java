package com.telusko.basic;

public class BreakContinue
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i == 7) {
                continue;   // this will skip the below part and go to the next iteration
            }

            if (i == 9) {
                // unlabeled Break Statement
                break;      // when the (i) is equal to 9 this loop will break ( so 10 won't be printed )
            }
            System.out.println("Value is " + i);


        }

        System.out.println();

        // labeled Break Statement
        // you can use any identifier and a colon
        ginura:
        for (int outer_count = 1; outer_count < 6; outer_count++)
        {
            for (int inner_count = 1; inner_count < 6; inner_count++)
            {
                if (outer_count == 3)
                {
                    //break;  // normal break will break the inner loop when outer_count == 3
                    // but if you want to break the outer loop we can label it
                    break ginura;
                }
                System.out.print(" # ");
            }
            System.out.println();


        }
    }

}

