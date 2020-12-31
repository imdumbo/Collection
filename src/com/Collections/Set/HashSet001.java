// -->It is not index based, it able to arrange all the elements on the basis of elements hashcode values.
//-->It will not allow duplicate elements.
//-->It will not follow insertion order.
//-->It will not follow Sorting order.
//-->It able to allow only one null value.
//-->Its internal data structure is "Hashtable".
//-->its initial capacity is "16" elements and its initial fill_Ratio is 75%.
//-->it is not synchronized.
//-->Almost all the methods are not synchronised.

package com.collection.Set;
import java.util.HashSet;
public class HashSet001 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(5);
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet<>(10,0.95F);
        hs1.addAll(hs);
        hs1.add("F");
        hs1.add("G");
        hs1.add("H");
        hs1.add("I");
        hs1.add("J");
        System.out.println(hs.size());
        hs1.add("K");
        System.out.println(hs1);
        System.out.println(hs1.size());
    }
}
