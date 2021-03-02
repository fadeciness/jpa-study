package ru.fadeciness.jpastudy.service;

import ru.fadeciness.jpastudy.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

}
