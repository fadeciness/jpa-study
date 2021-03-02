package ru.fadeciness.jpastudy.service;

import ru.fadeciness.jpastudy.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author getAuthorById(Long id);

}
