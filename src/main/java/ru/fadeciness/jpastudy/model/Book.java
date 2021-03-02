package ru.fadeciness.jpastudy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "book")
@SequenceGenerator(name = "seq_book_generator", sequenceName = "seq_book", allocationSize = 1)
public class Book {

    @Id
    @GeneratedValue(generator = "seq_book_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

}
