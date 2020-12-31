package com.collection;
import java.util.ArrayList;
public class Collection001 {
    public static void main(String[] args) {
        // initialise Arraylist1 of String type
        ArrayList<String> al = new ArrayList<>();
        al.add("A");   // adding elements to Arraylist1
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println("Arraylist 1st : "+al);
        // Initialise Arraylist2
        ArrayList<String> al1 = new ArrayList<>();
        // copy all elements present in Arraylist1 to Arraylist2
        al1.addAll(al);
        System.out.println("Arraylist 2nd : "+al1);
        al1.add("E");  // adding element to Arraylist2
        al1.add("F");
        al1.add("G");
        System.out.println("Arraylist 2nd : "+al1);
        al.remove("A");  // remove specified element present in Arraylist1
        System.out.println("Arraylist 1st : "+al+"      of size : "+al.size());
        al1.removeAll(al); // remove all elements of specified collection
        System.out.println("Arraylist 2nd : "+al1+"   of size : "+al1.size());
        System.out.println("Is B available in Arraylist 1st : "+al.contains("B"));
        ArrayList<String> al2 = new ArrayList<>(al); // initialise new Arraylist3 that contains
                                           // all element of specified collection
        System.out.println("Arraylist 3rd : "+al2);
        System.out.println("Is Arraylist 3rd contains all element of Arraylist 1st : "+al2.containsAll(al));
        al2.add("A");
        al2.add("E");
        al2.add("E");
        al2.add("F");
        al2.add("G");
        System.out.println("Arraylist 3rd : "+al2);
        System.out.println("Remove all elements from Arraylist 3rd except elements of Arraylist 1st : "+al2.retainAll(al));
        System.out.println("Arraylist 3rd : "+al2);
        System.out.println("Is Arraylist 1st or 3rd are equal : "+al.equals(al2));
        al2.clear();   // remove all elements of Arraylist3
        System.out.println("Arraylist 3rd : "+al2);
        System.out.println("Is Arraylist 3rd empty : "+al2.isEmpty());
        Object[] obj = al.toArray();
        System.out.print("Elements of Arraylist 1st : ");
        for(Object O : obj){
            System.out.print(O+" ");
        }


    }
}



/* COLLECTION :
--------------
Collection is an Object, it able to represent a group of other objects.

WHY Collection over Array..???
------------------------------
1. Array are fixed size in nature while collection are Dynamically Growable in nature.

2. Array are able to allow homogenous elements while Collection are not..

3. Array doesn't provide predefine methods for Searching, Sorting..

NOTE :- Array provide very good performance in java application and it is better
        to use in java application, But For this, You have to already know size of Array
        your program require.
         */

