package com.telusko.basic;

public class Print_ASCII_Values
{
    public static void main(String[] args)
            // 7 bits
            // 2^7 = 128
            // 0 - 127
    {
        for (int i= 0; i <= 127; i++){
            //System.out.println((char)i);
            System.out.printf("%d  :  %c \n", i, i);
        }
    }

}
