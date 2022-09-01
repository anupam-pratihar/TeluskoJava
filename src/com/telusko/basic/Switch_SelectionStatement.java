package com.telusko.basic;

public class Switch_SelectionStatement
{
    public static void main(String [] args)
    {
// Normal Method
        int number = 6;
        if (number == 1)
            System.out.println("One");
        else if (number == 2)
            System.out.println("Two");
        else if(number == 3)
            System.out.println("Three");
        else if (number == 4)
            System.out.println("Four");
        else if (number == 5)
            System.out.println("Five");
        else
            System.out.println("Still under developing");

        System.out.println();

// Switch Method
        int numb = 9;
        // switch doesn't support double ( only over 1.7 support Strings in switch )
        // char support
        // inside to the switch you can pass a number
        // instead of having if we use case here
        // use break in every case if you don't use it cases after the true case will automatically print
        // if none of the cases didn't execute default case will execute
        switch(numb)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Still under Developing");
        }

        // enhanced switch method
        numb = 5;
        switch (numb)
        {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> {
                System.out.println("Three");
                System.out.println("Three");
            }
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("Still under Developing");
        }

        String name = "Ginura";
        switch(name){
            case "ginura":
                System.out.println("Simple");
                break;
            case "Ginura":
                System.out.println("Capitalized");
                break;
            case "GINURA":
                System.out .println("Capital");
                break;
        }
    }
}
