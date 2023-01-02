package com.telusko.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunnerForComparableAndComparator {
    public static void main(String[] args) {

    // ! Comparable
        System.out.println("-- Using Comparable --");
        ArrayList<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16,800));
        laps.add(new Laptop("Apple", 8,2000));
        laps.add(new Laptop("Acer", 12,700));

        /*
            * You can't use Collection.sort(laps) on custom objects it will only works on Strings and Integers
            ? When we are sorting this one we need to decide based on what parameter we need to sort this
            * If you see the sort method in there it says it will take those things which are comparable
            * So if you want to sort your laptop you need to implement interface called as compatible
                    ? public class Laptop implements Comparable<Laptop>
            * in there you can have your own logic here by specifying what parameter you need consider
            * when you are doing the sorting
            *
            ? To implement that we have to
            * implement a method which is comparedTo
                * so compatible interface has this method called as compareTo
         */

        Collections.sort(laps);
        for(Laptop laptop : laps){
            System.out.println(laptop + " ");
        }

        /*
             ! If you want to sort collection of values or list of values
                * You implements a comparable interface
                * so every class needs to have a comparable if you want to sort them
        */



    // ! Comparator
        System.out.println("\n-- Using Comparator --");
        ArrayList<Laptop2> laps2 = new ArrayList<>();
        laps2.add(new Laptop2("Dell", 16,800));
        laps2.add(new Laptop2("Apple", 8,2000));
        laps2.add(new Laptop2("Acer", 12,700));
        /*
            * we will be using comparator in two situations
                ? 1) What if you got a class and this class not implementing any interface
                          * What if you are using some third-party library and that library has this class (Laptop2)
                          * SO you cannot change the source code
                               * in this case what you will do is you can specify the logic in the sort method
                               * sort method takes 2 parameters too
                                  * 1) list
                                  * 2) comparator object
                                        ? Collections.sort(laps,comparator)
                ? 2) Even if you have implemented the Comparable and override compareTo but
                     ? what if we want to sort them based on some other parameter
                            * because by default it will be getting sorted by based on RAM
                            * but maybe want to sort based on price
                            * to do that you can pass comparator again
         */


        // * Here we have to pass object of comparator
        Comparator<Laptop2> comparator = new Comparator<Laptop2>() {
            @Override
            public int compare(Laptop2 l1, Laptop2 l2) {
                if (l1.getPrice() > l2.getPrice())
                    return 1;
                else if(l1.getPrice() == l2.getPrice())
                    return 0;
                else
                    return -1;
            }
        };

        Collections.sort(laps2, comparator);
        for(Laptop2 laptop : laps2){
            System.out.println(laptop + " ");
        }
    }
}
