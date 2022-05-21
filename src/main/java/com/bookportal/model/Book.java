package com.bookportal.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Setter
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String bookauthor;

    private String booktitle;

    private String imageurll;

    private String isbn;

    private String publisher;

    private String yearofpublication;
}
