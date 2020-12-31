// 1.Enumeration is applicable for only Legacy Collections.
// 2.Enumeration is able to allow only read operation while iterating elements.

package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration001 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.addElement("A");
        v.addElement("B");
        v.addElement("C");
        v.addElement("D");
        v.add("E");
        v.add("F");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){              // Public boolean hasMoreElements() returns true if atleast one  next element exist
            System.out.println(e.nextElement()); // If atleast next element is existed then read next element and move cursor to next position

        }
    }
}
