package org.example.fabianelo.abril21;

import java.util.Stack;

public class ColasPilas {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("Item 1");
        pila.push("Item 2");
        pila.push("Item 3");

        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());
    }
}
