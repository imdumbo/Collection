// ArrayList
//-------------
// => allow duplicates
// => follow insertion order
// => not synchronized --> allow more than one thread to run --> parallel execution --> reduce execution time --> increase performance --> doesn't allow data consistency
//    --> not threadsafe
// => new_Capacity=(Current_Capacity*3/2)+1

package com.collection;
import java.util.ArrayList;
public class ArrayList001 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("F");
        System.out.println(al);

        al.add(1,"X");
        System.out.println(al.add("C"));  // return True when an element added to the list
        System.out.println(al);

        al.add(5,"E");  // add element to the list at specified index and increment index of previously saved elements
        System.out.println(al);

        System.out.println(al.set(3,"Y")); // this will return value of specified index and replace it with new value
        System.out.println(al);

        // System.out.println(al.set(7,\"Z\")); this will give IndexOutOfBoundsException

        System.out.println(al.get(4)); // get element at specified index

        System.out.println(al.remove(6)); // remove element from specified index
        System.out.println(al);

        al.add(6,"X");
        al.add(7,"B");
        al.add(8,"X");

        al.add(new Integer(10));
        al.add(null);
        al.add(null);
        System.out.println(al);

        System.out.println(al.indexOf("X")); // will return Index of parameter from starting

        System.out.println(al.lastIndexOf("X")); // will return Index of parameter from last
    }
}
