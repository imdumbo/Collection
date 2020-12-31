// Vector
//-------------
// => allow duplicates
// => Legacy Collection.
// => follow insertion order
// => not synchronized
//New_capacity=2*Current_Capacity

package com.collection;

import java.util.Vector;

public class Vector001 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity()); // return default capacity of vector
        Vector v1 = new Vector(20);
        System.out.println(v1.capacity()); // return specified capacity of vector
        Vector v2 = new Vector(5,3);
        System.out.println(v2.capacity());   // return specified capacity of vector
        v2.add("A");
        v2.add("B"); // add element to vector
        v2.add("C");
        v2.add("D");
        v2.add("E");
        System.out.println(v2.capacity()); // initial capacity of vector
        v2.add("F");  //
        System.out.println(v2.capacity()); // incremented by 3 capacity of vector
        Vector v3 = new Vector(v2); // initialise vector v3 and passing all elements of vector v2 to v3
        System.out.println("vector v3 : "+v3);
        v3.addElement(new Integer(10));
        System.out.println("vector v3 : "+v3);
        System.out.println("First element in Vector v3 : "+v3.firstElement());
        System.out.println("Last element in Vector v3 : "+v3.lastElement());
        System.out.println("Element at index 4 : "+v3.elementAt(4));
        System.out.println("Is element C exist and get removed : "+v3.removeElement("C"));   // if element exist and get removed than it will return true
        System.out.print("After removing element C : ");
        System.out.println(v3);
        v3.removeElementAt(5);
        System.out.print("After removing element at index 5 : ");
        System.out.println(v3);
        v3.removeAllElements();
        System.out.print("After removing all elements : ");
        System.out.println(v3);
    }
}
