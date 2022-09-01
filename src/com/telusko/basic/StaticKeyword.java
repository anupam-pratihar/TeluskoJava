package com.telusko.basic;
// Static variables are same for all the objects
// Non-Static variables are different for all the objects
// cannot use non-static variable in static block
// you cannot access non-static variable inside a static method
// ( inside the main you can't access a variable which define before the main method( inside the class) )
// so you need to static that variable too

class Employee{
    int employee_id;
    int salary;
    static String ceo;    // now this will be same for the all the objects

    // static block
    // this static block will be executed when you load a class (class will only load once )
    // even if you define static block after the constructor this part will execute first
    static {
        // doesn't matter how many objects you create
        // this will execute only once
        ceo = "Oliver Queen";

        // let's demonstrate how many will be executed this static block
        System.out.println("In Static");
    }

    public void show(){
        System.out.println(employee_id + " : " + salary + " : " + ceo);
    }

    // with a constructor you can define a default value for those variables
    // this constructor will be executed when you create an object
    public Employee(){
        employee_id = 20210000;
        salary = 3000;
        //ceo = "Larry";
        // the value of ceo should be assigned only once
        // you don't have to specify ceo when you create every object
        // because constructor will be called all the objects ( everytime defines an object )
        // so you can do initialize static variables like above ( static block J)

        // let's demonstrate how many will be executed this constructor
        System.out.println("In Constructor");
    }
}

public class StaticKeyword {
    public static void main(String[] args){
        Employee ginura = new Employee();
        Employee naveen = new Employee();
        ginura.show();  // this will print the default values including the static default inside the static block
        naveen.show();

        ginura.employee_id = 20210319;      // ginura's employee id will access here
        ginura.salary = 4000;
        ginura.ceo = "Seram";

        naveen.employee_id = 20210320;      // naveen's employee id will access here
        naveen.salary = 8000;
        naveen.ceo = "Seram";

        ginura.show();
        naveen.show();


        // since both are working for the same company if the ceo change in naveen
        // ginura's ceo also need to change automatically ( only one ceo can have for a one company )
        // if we change the naveen's ceo as below, it won't change the ginura's ceo

        // to do that you can make that ceo variable into a static variable
        // and now if you change anyone's ceo it will change the others' ceo also
        // now this is same for the all the object you can use class name too
        // ( Employee.ceo = "Chandima" )
        // so access a static variable we don't need an object, class name is enough
        naveen.ceo = "Chandima";
        ginura.show();
        naveen.show();


        // so if you make a method static
        // if you want to call that method we don't need an object
    }
}
