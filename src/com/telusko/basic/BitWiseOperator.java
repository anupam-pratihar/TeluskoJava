package com.telusko.basic;


// BitWise Operators = And(&)  OR(|)
public class BitWiseOperator {
    public static void main(String[] args){

        int a = 25; // binary format 1 1 0 0 1
        int b = 15; // binary format 0 1 1 1 1
        int c = a & b; // a AND b -> 0 1 0 0 1 = 9
        System.out.println(c);

        int d = a | b; // a OR b  -> 1 1 1 1 1 = 31
        System.out.println(d);

    }
}
