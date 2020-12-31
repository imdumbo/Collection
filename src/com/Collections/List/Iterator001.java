// Iterator is able to allow both read and remove operatins while iterating elements.
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator001 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println(al); // print ArrayList al
        Iterator<String> it=al.iterator();
        while(it.hasNext())  // checking next element exist or not
        {
            String element=it.next();                // assign selected element equal to "element" variable
            System.out.println(element);             // print that element
            if(element.equals("C"))                  // if element equals to C
            {
                it.remove();                         // than remove it.
            }
        }
        System.out.println(al);                      // print new ArrayList
    }
}
