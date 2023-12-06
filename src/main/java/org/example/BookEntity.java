package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.libraryEntity.PublisherEntity;


@Getter
@Setter
@AllArgsConstructor
@ToString

public class BookEntity {
    private String tittle;
    private AuthorEntityes author;
    private PublisherEntity publsihers;

    @Override
    public String toString() {
        return "Название книги: " + tittle + "|Автор книги: " + author + "|Издательство: " + publsihers;
    }

    public BookEntity() {
    }

    public void setAuthors(org.example.AuthorEntity author) {
    }
}
