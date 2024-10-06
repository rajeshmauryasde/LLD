package org.example.design_patterns.creational.builder;

import lombok.Getter;

@Getter
public class Book {
    private final int id;
    private final String name;
    private final String publication;
    private final String writer;
    private final int price;

    public Book(BookBuilder bookBuilder) {
        this.id = bookBuilder.id;
        this.name = bookBuilder.name;
        this.publication = bookBuilder.publication;
        this.writer = bookBuilder.writer;
        this.price = bookBuilder.price;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
        private int id;
        private String name;
        private String publication;
        private String writer;
        private int price;

        public BookBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setPublication(String publication) {
            this.publication = publication;
            return this;
        }

        public BookBuilder setWriter(String writer) {
            this.writer = writer;
            return this;
        }

        public BookBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
