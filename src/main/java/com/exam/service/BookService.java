package com.exam.service;

import com.exam.model.Book;

import java.util.List;

public interface BookService{
    List<Book> findAll();

    Book save(Book book);

    Book findById(Long id);

    void delete(Long id);
}
