package org.example.design_patterns.structural.adapter;

public class XORList implements IXORList {
    private final int[] list;
    private int index;

    public XORList() {
        list = new int[10];
        index = 0;
    }
    @Override
    public void insert(int value) {
        list[index++] = value;
    }

    @Override
    public int delete() {
        return list[--index];
    }

    @Override
    public int get(int index) {
        return list[index];
    }
}
