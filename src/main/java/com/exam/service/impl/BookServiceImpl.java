package com.exam.service.impl;

import com.exam.model.Book;
import com.exam.repo.BookRepository;
import com.exam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        this.bookRepository.save(book);
        return book;
    }

    @Override
    public Book findById(Long id) {
        if (bookRepository.findById(id).isPresent()){
            return bookRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Book book = findById(id);
        bookRepository.delete(book);
    }
}
