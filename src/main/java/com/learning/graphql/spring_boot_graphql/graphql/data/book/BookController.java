package com.learning.graphql.spring_boot_graphql.graphql.data.book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.learning.graphql.spring_boot_graphql.graphql.data.author.Author;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument UUID id) {
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book){
        return Author.getAuthorById(book.authorId());
    }
}