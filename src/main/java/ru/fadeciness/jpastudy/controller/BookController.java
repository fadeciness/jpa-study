package ru.fadeciness.jpastudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.fadeciness.jpastudy.model.Book;
import ru.fadeciness.jpastudy.model.dto.NewBookDto;
import ru.fadeciness.jpastudy.model.dto.UpdateBookDto;
import ru.fadeciness.jpastudy.service.BookService;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<Long> createBook(@RequestBody NewBookDto newBookDto) {
        return new ResponseEntity<>(bookService.saveBook(newBookDto), HttpStatus.OK);
    }

    @PutMapping("/book")
    public ResponseEntity<Long> updateBook(@RequestBody UpdateBookDto updateBookDto) {
        return new ResponseEntity<>(bookService.updateBook(updateBookDto), HttpStatus.OK);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity updateBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }

}
