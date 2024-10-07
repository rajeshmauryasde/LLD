package org.example.design_patterns.creational.prototype;

import org.example.design_patterns.creational.prototype.pojo.Book;
import org.example.design_patterns.creational.prototype.pojo.Movie;
import org.example.design_patterns.creational.prototype.registry.Registry;

public class Main {
    public static void main(String[] args) {
        Registry registry = Registry.getInstance();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Sholay");
        movie.setDirector("Vasu");
        System.out.println(movie);

        Book book = (Book) registry.createItem("Book");
        book.setTitle("Krishna Movement");
        book.setAuthor("Krishna");
        System.out.println(book);
    }
}
