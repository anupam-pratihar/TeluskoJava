package com.telusko.basic;

class Students{
    int student_number;
    String student_name;
}


public class Array1D
{
    public static void main(String[] args)
    {
        // Let's create an array with integers
        // java arrays are objects, so we have to use new keyword and need to specify the size of the array

        int[] nums_array =new int [4];
        // as soon as you create that new object it will create an array of size 4 with 0 values
        System.out.println(nums_array[3]);
        System.out.println(nums_array[1]);
        System.out.println(nums_array[0]);
        System.out.println(nums_array[2]);
        System.out.println();

        // if you want to change the values you can change the values individually
        nums_array[0] = 450;
        nums_array[1] = 78;
        nums_array[2] = 13;
        nums_array[3] = 404;
        System.out.println(nums_array[0]);
        System.out.println(nums_array[1]);
        System.out.println(nums_array[2]);
        System.out.println(nums_array[3]);
        System.out.println();

        nums_array[2] = 250;
        System.out.println(nums_array[2]);
        System.out.println();

        // instead of above method we can print all the values like this too
        for (int i = 0; i < 4; i ++)
        {
            System.out.println(nums_array[i]);
        }
        System.out.println();

        // if we know the values before we create the array
        int[] nums_array1 = {4,6,56,246,346,4584,0};
        for (int j = 0; j < 7; j ++)
        {
            System.out.println(nums_array1[j]);
        }

        // we can create array of objects too
        Students student_1 = new Students();
        Students student_2 = new Students();
        Students student_3 = new Students();
        Students student_4 = new Students();

        Students students[] = new Students[4];
        // Students students[] = {student_1,student_2,student_3,student_4};  // you can define it as this also


    }
}
