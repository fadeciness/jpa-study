package ru.fadeciness.jpastudy.service;

import ru.fadeciness.jpastudy.model.Author;
import ru.fadeciness.jpastudy.model.dto.NewAuthorDto;
import ru.fadeciness.jpastudy.model.dto.UpdateAuthorDto;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author getAuthorById(Long id);

    Long saveAuthor(NewAuthorDto newAuthorDto);

    Long updateAuthor(UpdateAuthorDto updateAuthorDto);

    void deleteAuthor(Long id);

}
