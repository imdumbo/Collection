package com.collection.Set;

import java.util.*;

public class NavigableSet001 {
    public static void main(String[] args) {
        NavigableSet<String > ts=new TreeSet<>();
        ts.add("D");
        ts.add("F");
        ts.add("B");
        ts.add("E");
        ts.add("C");
        ts.add("A");
        System.out.println("NavigableSet is                                             :  "+ts);
        System.out.println("Lowest element among all greater than or equals to the 'D'  :  "+ts.ceiling("D"));
        System.out.println("Lowest element among all greater than to the 'D'            :  "+ts.higher("D"));
        System.out.println("Highest element among all less than or equals to the 'D'    :  "+ts.floor("D"));
        System.out.println("Highest element among all less than or equals to the 'D'    :  "+ts.lower("D"));
        System.out.println("NavigableSet in reverse order                               :  "+ts.descendingSet());
        System.out.println("Remove and Return first element from NavigableSet           :  "+ts.pollFirst());
        System.out.println("Remove and Return last element from NavigableSet            :  "+ts.pollLast());
        System.out.println("NavigableSet is                                             :  "+ts);
    }
}
