package com.bookportal.controller;

import com.bookportal.model.Book;
import com.bookportal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public ResponseEntity<List<Book>> get() {
        List<Book> books = bookService.findAll();
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }

    @PostMapping ("/")
    public ResponseEntity<Book> save(@RequestBody Book book) {
        Book book1 = bookService.save(book);
        return new ResponseEntity<Book>(book1, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        bookService.delete(id);
        return new ResponseEntity<String>("Book is deleted.", HttpStatus.OK);
    }


}
