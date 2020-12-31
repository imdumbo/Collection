// child class to Vector
// it follows LIFO
package com.collection;

import java.util.Stack;

public class Stack001 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");
        s.push("F");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search("B"));
        System.out.println(s.search("A"));
        System.out.println(s.search("D"));


    }
}
