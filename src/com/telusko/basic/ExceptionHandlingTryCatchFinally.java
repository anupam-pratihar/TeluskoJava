package com.telusko.basic;

public class ExceptionHandlingTryCatchFinally {
    public static void main(String[] args){
        try {
            int i = 7;
            int j = 0;
            int k = 9 / 0;
            // in this block exception will be thrown
            // if you get an error it won't come here, it will jump to the catch block
            System.out.println("output is " + k);
        }
        // you can catch that exception with the catch block
        catch (Exception e){
            System.out.println("Exception");
            // if you want to be that Exception in red color you can use
            // System.err.println("Exception");
        }

        System.out.println("Bye");

    }

}
