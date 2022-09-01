package com.telusko.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSeries
{
    public static void main(String[] args)
    {
        fibanacciSeries();
        palindromeNumber();
        perfectNumber();
        armstrongNumber();
    }

    public static void armstrongNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int number = scanner.nextInt();  // 153
        int temp = number;
        int endNumber;
        int sum = 0;

        while(number > 0)
        {
            endNumber = number % 10;  // endNumber = 3
            number = number / 10;  // number = 15 ( 3 will eb removed )
            sum += endNumber * endNumber * endNumber;
        }

        if(sum == temp)
            System.out.println(temp + " is an Armstrong Number");
        else
            System.out.println(temp + " isn't an Armstrong Number");
    }

    public static void perfectNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int number = scanner.nextInt();
        ArrayList<Integer> factorsList = new ArrayList<>();
        for(int index = 1; index<number; index ++)
        {
            if (number % index == 0)
            {
                factorsList.add(index);
            }
        }
        int total=0;
        for(int factor:factorsList){ total += factor; }

        if (total == number)
            System.out.println(number + " is a Perfect Number (" +total+")" );
        else
            System.out.println(number + " isn't a Perfect Number (" +total+")" );

    }
     public static void fibanacciSeries()
     {
         Scanner scanner = new Scanner(System.in);
         // ! Fibanacci Series
         System.out.println("Fibonacci Series");
         System.out.print("Enter the End of the Fibonacci Series: ");
         int end = scanner.nextInt();
         int temp = 1;
         int temp_2 = 0;
         int number = 0;
         System.out.print(1 + " ");
         for(int outer_index = 1; outer_index < end; outer_index++)
         {
             number =  temp + temp_2;
             System.out.print(number + " ");
             temp_2 = temp;
             temp = number;
         }
     }
    public static void palindromeNumber()
    {
        Scanner scanner = new Scanner(System.in);
        // ! Palindrome Series
        System.out.println("\n\nPalindrome Series");
        System.out.print("Enter your Number: ");
        int inputtedNumber = scanner.nextInt();
        String reversedStringNumber="";
        String inputtedStringValue = String.valueOf(inputtedNumber);
        for(int index = inputtedStringValue.length()-1; index >= 0; index--)
        {
            reversedStringNumber += String.valueOf(inputtedStringValue.charAt(index));
        }

        int reversedNumber = Integer.parseInt(reversedStringNumber);
        if (inputtedNumber == reversedNumber)
            System.out.println("This is a Palindrome Number");
        else
            System.out.println("This isn't a Palindrome Number");

        // ? Telusko's answer
        int n=inputtedNumber,r,s=0;
        int t = n;
        while (n > 0)
        {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        if(t==s)
            System.out.println("This is a Palindrome Number");
        else
            System.out.println("This isn't a Palindrome Number");
    }


}
