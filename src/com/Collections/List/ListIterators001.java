// It is an interface provided by JAVA along with JDK1.2 version.
// It able to allow to read elements in both forward direction and backward direction.
// It able to allow the operations like read, insert, replace and remove while iterating elements .
// ListIterator is applicable for only List implementations
package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators001 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        System.out.println(ll);
        ListIterator<String> lit=ll.listIterator();
        System.out.println("Elements in Forward Direction");
        while(lit.hasNext())
        {
            System.out.println(lit.nextIndex()+"--->"+lit.next());
        }
        System.out.println();
        System.out.println("Elements in Backward Direction");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previousIndex()+"--->"+lit.previous());
        }

        while(lit.hasNext()){
            String element = lit.next();
            if(element.equals("B"))
            {
                lit.add("X");
            }
            if(element.equals("D"))
            {
                lit.set("Y");
            }
            if(element.equals("E"))
            {
                lit.remove();
            }
        }
        System.out.println(ll);
    }
}

