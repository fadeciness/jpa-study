package ru.fadeciness.jpastudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.fadeciness.jpastudy.model.Author;
import ru.fadeciness.jpastudy.model.dto.NewAuthorDto;
import ru.fadeciness.jpastudy.model.dto.UpdateAuthorDto;
import ru.fadeciness.jpastudy.service.AuthorService;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        return new ResponseEntity<>(authorService.getAuthorById(id), HttpStatus.OK);
    }

    @PostMapping("/author")
    public ResponseEntity<Long> createBook(@RequestBody NewAuthorDto newAuthorDto) {
        return new ResponseEntity<>(authorService.saveAuthor(newAuthorDto), HttpStatus.OK);
    }

    @PutMapping("/author")
    public ResponseEntity<Long> updateBook(@RequestBody UpdateAuthorDto updateAuthorDto) {
        return new ResponseEntity<>(authorService.updateAuthor(updateAuthorDto), HttpStatus.OK);
    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity updateBook(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.ok().build();
    }

}
