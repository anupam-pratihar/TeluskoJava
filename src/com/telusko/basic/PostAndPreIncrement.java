package com.telusko.basic;

public class PostAndPreIncrement {
    public static void main(String [] args){
        int number_1 = 5;
        int number_2 = 2;

        // number_1 ++ ( post increment ) this will assign the value and then increment it

        number_1 = number_2 ++;     // here number_1 will be 2 then number_2 will be 3
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println();


        // ++ number_1 ( pre increment ) this will first increment the value and then assign it
        number_1 = 5;
        number_2 = 2;

        number_1 = ++ number_2;     // here number_2 will be 3, and then it will assign to the number_1
        System.out.println(number_1);
        System.out.println(number_2);

        int i = 5;

        /*  this what happens below (re-assign the previous value to changed value, so value won't change)
        int temp;
        temp = i;
        i++;
        i=temp;
        */

        i = i++;
        System.out.println(i);

    }
}
