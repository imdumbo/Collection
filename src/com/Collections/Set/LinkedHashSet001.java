// LinkedHashSet is following insertion order.
// LinkedHashSet was introduced in JDK1.4 version
// The internal data structure of LinkedHashSet is "Hashtable" and "LinkedList".
package com.collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSet001 {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        System.out.println(lhs);
    }
}
