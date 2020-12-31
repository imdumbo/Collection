// not synchronized Collection.
// internal data structure is "Double LinkedList"
// allows duplicate elements.

package com.collection;

import java.util.LinkedList;

public class LinkedLIst001 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        System.out.println(l);
        LinkedList<String> l1 = new LinkedList<>(l); // Initialise l1 LinkedList and passing elements of l to l1
        System.out.println(l1);
        l1.addFirst("X");  // add Element at First position
        l1.addLast("Z");   // add Element at Last position
        System.out.println(l1);
        System.out.println(l.getFirst()); // return First element of LinkedList l
        System.out.println(l.getLast());  // return Last element of LinkedList l1
        System.out.println(l1.getClass()); // return class of collection type

    }
}
