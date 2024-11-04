package com.learning.graphql.spring_boot_graphql.graphql.data.book;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Book(
    UUID id,
    String name,
    Integer pageCount,
    Integer authorId
) {
    
    public static List<Book> books = Arrays.asList(
        new Book(UUID.randomUUID(), "Quran", 604, 2),
        new Book(UUID.randomUUID(), "Harry Potter", 700, 2),
        new Book(UUID.randomUUID(), "Foobar", 100, 3),
        new Book(UUID.randomUUID(), "Spring Boot", 344, 1)
    );

    public static Optional<Book> getBookById(UUID id) {
        return books.stream().filter(book -> book.id.equals(id)).findFirst();
    }
}
