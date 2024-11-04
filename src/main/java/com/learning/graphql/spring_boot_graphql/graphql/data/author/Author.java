package com.learning.graphql.spring_boot_graphql.graphql.data.author;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(
    Integer id,
    String firstName,
    String lastName
) {
    
    public static List<Author> authors = Arrays.asList(
        new Author(1, "Gabriel", "Bonaretti"),
        new Author(2, "Nicole", "Siqueira"),
        new Author(3, "Diego", "Castan")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(author -> author.id.equals(id)).findFirst();
    }
}
