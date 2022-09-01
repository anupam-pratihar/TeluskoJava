/*
to build a building we require a plan or a blueprint
    so, that building is an OBJECT

to build any object your JVM needs a structure or a blueprint
    so, that blueprint or the structure is your class (class defines the structure of an object)

So, every object will have a behavior
    in that blueprint(class) we can define what is the behavior and what is the values
 */

package com.telusko.basic;

class Calc
{
    int num1;       // variables
    int num2;
    int result;

    // how create a method
    public void perform()  // public is the access modifier ( so we can access this from anywhere )
    {
        result = num1 + num2;
    }

}

public class ClassAndObject
{
    public static void main(String[] args)
    {
        // when you need to create an object of calc ( we create a reference for Calc )
        Calc obj;   //reference
        // let's create an object of it ( only way to create an object if with the help of new keyword)
        // new keyword is responsible to allocate the memory
        // ( how much memory you need will be defined by the constructor )
        obj = new Calc(); // this is you object ( obj is just the reference )

        // you can do above thing in one line
        // Calc obj = new Calc();

        // here Calc is the blueprint and object as the real instance
        // object knows something ( we are talking about the variables )
        // object does something ( we are talking about the methods )
        // when you run this main method is the first statement which will get executed

        // to access something in Calc class we need to use reference_name.
        obj.num1 = 3;
        obj.num2 = 7;
        System.out.println(obj.result); // if we use this, this will print default value of result, which is 0

        // so we need to call the method that change the value of result
        obj.perform();
        System.out.println(obj.result);
    }
}

