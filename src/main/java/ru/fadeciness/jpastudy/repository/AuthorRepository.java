package ru.fadeciness.jpastudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fadeciness.jpastudy.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
