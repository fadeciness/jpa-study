package ru.fadeciness.jpastudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fadeciness.jpastudy.exception.AuthorNotFoundException;
import ru.fadeciness.jpastudy.model.Author;
import ru.fadeciness.jpastudy.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository repository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    @Override
    public Author getAuthorById(Long id) {
        final Optional<Author> author = repository.findById(id);
        if (!author.isPresent()) {
            throw new AuthorNotFoundException("There's no author with id: " + id);
        }
        return author.get();
    }
}
