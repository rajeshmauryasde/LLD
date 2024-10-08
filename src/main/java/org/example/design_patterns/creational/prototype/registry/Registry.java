package org.example.design_patterns.creational.prototype.registry;

import org.example.design_patterns.creational.prototype.pojo.Book;
import org.example.design_patterns.creational.prototype.pojo.Item;
import org.example.design_patterns.creational.prototype.pojo.Movie;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Registry {
    Map<String, Item> itemRegistry;
    private static volatile Registry instance;

    private Registry() {
        itemRegistry = new HashMap<>();
        loadItems();
    }

    public static Registry getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Registry();
        }
        return instance;
    }

    private void loadItems() {
        Item item1 = new Book("title1", 500, "https://items.com/books", "author1");
        itemRegistry.put("Book", item1);

        Item item2 = new Movie("title1", 200, "https://items.com/movies", "director1");
        itemRegistry.put("Movie", item2);
    }

    public Item createItem(String type) {
        if (itemRegistry.containsKey(type)) {
            return itemRegistry.get(type).clone();
        }
        throw new RuntimeException("Invalid type");
    }
}
