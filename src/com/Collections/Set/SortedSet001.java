package com.collection.Set;

import java.util.*;

public class SortedSet001 {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<>();
        ss.add("D");
        ss.add("A");
        ss.add("E");
        ss.add("G");
        ss.add("C");
        ss.add("F");
        ss.add("B");
        System.out.println("Sorted Set                   : "+ss);
        System.out.println("First Element of Set         : "+ss.first());
        System.out.println("Last Element of Set          : "+ss.last());
        System.out.println("Elements before 'D'          : "+ss.headSet("D"));
        System.out.println("Elements after 'D'           : "+ss.tailSet("D"));
        System.out.println("Elements between 'B' and 'E' : "+ss.subSet("B","E"));




    }
}
