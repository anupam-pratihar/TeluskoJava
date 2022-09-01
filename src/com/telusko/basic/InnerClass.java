package com.telusko.basic;

class Outer {
    int a;
    public void show(){
    }

    // we can create a class inside a class
    // if you create an inner static class instead of object name to create an object of it use class name
    // Outer.Inner inner_class = Outer.new Inner();
    class Inner{                    // inner class name will be Outer$Inner.class
        public void display(){
            System.out.println("This is Inner Class Display method");
        }

    }

}

public class InnerClass {
    // inside a class we can have methods , variables
    public static void main(String[] args){
        Outer outer_class = new Outer();
        // when you want to access a method(non-static) you need use the object name
        outer_class.show();

        // how to create an object of Inner class
        // Inner inner_object = new Inner();  this will give you an error
        // class name               this is the constructor
        // to use Inner
        Outer.Inner inner_class = outer_class.new Inner();
        // new Inner(); this part is an object so to access that you need use the Outer class object
        // in order to use the Inner class you need to use the Outer class
        // in order to create an object of the Inner class we need to use the object of the outer class

        inner_class.display();
    }
}
