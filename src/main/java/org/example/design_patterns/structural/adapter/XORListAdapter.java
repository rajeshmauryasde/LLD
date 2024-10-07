package org.example.design_patterns.structural.adapter;

public class XORListAdapter implements List {
    private final IXORList xorList;

    public XORListAdapter() {
        xorList = new XORList();
    }

    @Override
    public void add(int value) {
        xorList.insert(value);
    }

    @Override
    public int remove() {
        return xorList.delete();
    }

    @Override
    public int get(int index) {
        return xorList.get(index);
    }
}
