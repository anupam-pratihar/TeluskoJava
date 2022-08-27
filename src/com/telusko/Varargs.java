package com.telusko;

class Calculate{

    // returns an int value (use int instead of void)
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    public int add_array(int ...values) // arguments get as an array {3,5,6,4,6,2,5,23,3,3,5}
    {
        // to add those you can write a for loop
        int sum = 0;
        for (int value:values){
            sum += value;
        }
        return sum;
    }

}

public class Varargs {
    // Vararags stands for variable length arguments
    public static void main(String[] args){

        Calculate calc_object = new Calculate();
        int result = calc_object.add(30,40);
        System.out.println(result);
        System.out.println(calc_object.add(50,50));
        System.out.println();

        // but if you want to add more than 2 or 3 value
        // to do this when you send more than 2 arguments you have to increase the parameters too
        // so now doesn't matter how many numbers you are going to pass it will go as an array
        // then by for loop it will iterate the values in it and add those
        // then it will return the sum of those numbers
        int add_array_result = calc_object.add_array(3,5,6,4,6,2,5,23,3,3,5);
        System.out.println(calc_object.add_array(10,20));
        System.out.println(calc_object.add_array(0,1,0,1));
        System.out.println(calc_object.add_array(0));
        System.out.println(calc_object.add_array(5));


    }
}
