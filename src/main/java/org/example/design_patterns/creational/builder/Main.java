package org.example.design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Book book = Book.builder().setId(1).setName("Rajesh").build();
        System.out.println(book.getId());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getPublication());
        System.out.println(book.getWriter());
    }
}
