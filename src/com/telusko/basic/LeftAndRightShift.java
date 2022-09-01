package com.telusko.basic;

public class LeftAndRightShift {
    public static void main(String[] args){
        int a = 8; // binary format 1 0 0 0

        // left shift
        int b = a << 2;  // 1 0 0 0 0 0
        System.out.println(b);

        // right shift
        int c = a >> 2; // 1 0 
        System.out.println(c);

    }
}
