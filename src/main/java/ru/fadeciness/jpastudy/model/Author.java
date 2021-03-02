package ru.fadeciness.jpastudy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "author")
@SequenceGenerator(name = "seq_author_generator", sequenceName = "seq_author", allocationSize = 1)
public class Author {

    @Id
    @GeneratedValue(generator = "seq_author_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
