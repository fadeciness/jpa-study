package ru.fadeciness.jpastudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fadeciness.jpastudy.exception.BookNotFoundException;
import ru.fadeciness.jpastudy.model.Book;
import ru.fadeciness.jpastudy.model.dto.NewBookDto;
import ru.fadeciness.jpastudy.model.dto.UpdateBookDto;
import ru.fadeciness.jpastudy.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        final Optional<Book> book = repository.findById(id);
        if (!book.isPresent()) {
            throw new BookNotFoundException("There's no book with id: " + id);
        }
        return book.get();
    }

    @Override
    public Long saveBook(NewBookDto newBookDto) {
        Book newBook = new Book();
        newBook.setTitle(newBookDto.getTitle());
        final Book result = repository.saveAndFlush(newBook);
        return result.getId();
    }

    @Override
    public Long updateBook(UpdateBookDto updateBookDto) {
        Book newBook = new Book();
        newBook.setId(updateBookDto.getId());
        newBook.setTitle(updateBookDto.getTitle());
        final Book result = repository.saveAndFlush(newBook);
        return result.getId();
    }

    @Override
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

}
