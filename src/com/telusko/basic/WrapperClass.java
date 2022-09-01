package com.telusko.basic;

// for normal applications we can use primitives ( this is faster than Wrapper classes )
// for applications which doesn't support primitives we have to use wrapper classes

public class WrapperClass {
    public static void main(String[] args){
        int primitive_i = 5;    // Primitive Datatype
        Integer object_i = new Integer(5);  // this integer called as the wrapper class
        // the deference is first primitive_i is a primitive variable and the object_i is a reference variable

        Float object_f = new Float(5.05);

        // if you're passing a primitive value to the wrapper class this concept is called as Boxing/Wrapping
        Integer object_ii = new Integer(primitive_i);// putting a value inside the object is called as boxing/wrapping

        // to get the value
        System.out.println(object_i.intValue());
        System.out.println(object_f.floatValue());

        // you can assign it to a new variable too
        int new_variable = object_ii.intValue(); // taking a value from the object is called as unboxing/unwrapping
        System.out.println(new_variable);

        // let's create a new integer object
        // we can directly use like below
        // in the background java will do this part " new Integer(primitive_i); "
        Integer value = primitive_i;        // AutoBoxing or AutoWrapping
        int new_value = value; // Auto Unboxing or Auto Unwrapping
        // you don't need to use the object_name.intValue();

        String str = new String("20201");
        // if you want the integer value of str
        int number = Integer.parseInt(str);
        System.out.println(number);

    }
}
