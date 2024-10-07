package org.example.design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        List list = new XORListAdapter();
        list.add(1);
        list.add(2);
        System.out.println(list.get(0) + " " + list.get(1));
        System.out.println(list.remove());
    }
}