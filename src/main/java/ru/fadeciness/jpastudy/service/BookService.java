package ru.fadeciness.jpastudy.service;

import ru.fadeciness.jpastudy.model.Book;
import ru.fadeciness.jpastudy.model.dto.NewBookDto;
import ru.fadeciness.jpastudy.model.dto.UpdateBookDto;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Long saveBook(NewBookDto newBookDto);

    Long updateBook(UpdateBookDto updateBookDto);

    void deleteBook(Long id);

}
