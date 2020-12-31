package com.collection.Set;

public class Set001 {
    public static void main(String[] args) {
        System.out.println("Set:\n" +"--------------\n"+
                "-->It was introduced in JDK1.2 version.\n" +
                "-->It is a direct chaild interface to Collection interface.\n" +
                "-->It is not index based, it able to arrange all the elements on the basis of elements hashcode values.\n" +
                "-->It will not allow duplicate elements.\n" +
                "-->It will not follow insertion order.\n" +
                "Note: LinkedHashSet will follow insertion order.\n" +
                "-->It will not follow Sorting order.\n" +
                "Note: SortedSet, NavigableSet and TreeSet are following Sorting order.\n" +
                "-->It able to allow only one null value.\n" +
                "Note: SortedSet, NavigableSet and TreeSet are not allowing even single null value.");
    }
}
