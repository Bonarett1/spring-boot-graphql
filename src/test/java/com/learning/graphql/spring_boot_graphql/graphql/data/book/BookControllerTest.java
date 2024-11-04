package com.learning.graphql.spring_boot_graphql.graphql.data.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.HttpGraphQlTester;

@GraphQlTest(BookController.class)
public class BookControllerTest {
    
    @Autowired
    private HttpGraphQlTester graphQlTester;

    @Test
    void canGetBooks() {
        graphQlTester
            .documentName("book/booksQuery")
            .execute()
            .path("books")
            .entityList(Book.class)
            .hasSize(4);
    }
}
