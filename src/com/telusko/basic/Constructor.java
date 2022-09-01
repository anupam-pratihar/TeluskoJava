package com.telusko.basic;

// constructor is a member method
// same name as class name
// it will never return anything
// it will be used to allocate memory
// as soon as you create an object it will call the constructor
// (we don't have to call it , it will get call automatically)
class Name
{
    int i;
    float f;
    // constructor ( will be used to allocate the memory to the object )
    // how much space is required for an object, this answer will be given by the constructor
    // even if you don't mention it there is a constructor in every class
    // constructor is a member method which has the same name as the class name ( use brackets )
    // constructor will never return anything that's why we have to write public
    // everytime you want to create an object you have to use constructor
    // even if you don't define the constructor it will be there inside your class
    public Name() {
        // you can use constructor to set a default values to variables ( by default those are 0 )
        i = 5;
        f = 5.0f;
        System.out.println("Hi");
    }

    // to call this block
    public Name(int k){
        i = k;
        System.out.println("Hello");
    }
}

public class Constructor
{
    public static void main(String[] args)
    {
        Name new_object;
        new_object = new Name();        // in here we are calling default constructor
        System.out.println(new_object.i);
        System.out.println(new_object.f);

        // to call the second constructor you just need to pass a value
        Name other_object = new Name(5);

    }
}

// we can have different types of constructors
// you can have another constructor too, but you need to define it with 2 parameters