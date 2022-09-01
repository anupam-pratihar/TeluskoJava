package com.telusko.basic;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println();

        // ! 1st Method :
        int temp = a;       // temp = 5
        a = b;              // a = 4
        b = temp;           // b = 5
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println();

        // * Since we are using a temp variable we are wasting the memory

        // * So, You can do the swapping as this,
        a = 5;
        b = 4;
        a = a + b;      // a = 9
        b = a - b;      // b = 5 ( 9 - 4 )
        a = a - b;      // a = 4 ( 9 - 5 )
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println();

        // * in the above method first 5 will get 3 bits (101) but once its become 9 it takes
        // * 4 bits (1001) and still you waste one bit

        // ? Without wasting any bits we can do it using XOR Operations
        /*
              ?  1 XOR 1 -> 0
              ?  0 XOR 0 -> 0
              ?  1 XOR 0 -> 1
              ?  0 XOR 1 -> 1
         */
        a = 5;
        b = 4;
        a = a ^ b;      // 1 0 1 ^ 1 0 0 = 0 0 1
        b = a ^ b;      // 0 0 1 ^ 1 0 0 = 1 0 1 (5)
        a = a ^ b;      // 0 0 1 ^ 1 0 1 = 1 0 0 (4)
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println();


        System.out.println("Easiest Way");
        // * Another Way
        a = 5;
        b = 4;
        b = a + b - (a = b);
        System.out.println("a : " + a);
        System.out.println("b : " + b);




    }
}
