package org.example.solid.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * If we inherit list to make it as stack, it will violate Liskov Substitution Principle, as the other method which
 * are not relevant for stanch will also be needs to be implemented. e.g. insert(), remove(), get(), etc
 */

public class Stack {
    private final List<Integer> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.removeLast();
    }

    public int top() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.getLast();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
