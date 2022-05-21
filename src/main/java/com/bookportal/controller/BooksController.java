package com.bookportal.controller;

import com.bookportal.model.classbookordered.Bookkk;
import com.bookportal.model.classbookordered.Category;
import com.bookportal.service.BookkkkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/bookkk")
public class BooksController {
    @Autowired
    private BookkkkService bookkkkService;

    //add Book service
    @PostMapping("/")
    public ResponseEntity<Bookkk> add(@RequestBody Bookkk bookkk) {
        return ResponseEntity.ok(this.bookkkkService.addBook(bookkk));
    }

    //update Book

    @PutMapping("/")
    public ResponseEntity<Bookkk> update(@RequestBody Bookkk bookkk) {
        return ResponseEntity.ok(this.bookkkkService.updateBook(bookkk));
    }

    //get quiz
    @GetMapping("/")
    public ResponseEntity<?> quizzes() {
        return ResponseEntity.ok(this.bookkkkService.getBooks());
    }

//    //get quiz
//    @GetMapping(value = "/",params = {"page","size"})
//    public List<Bookkk> quizzesPaginated(@RequestParam("page") int page, @RequestParam("size") int size, UriComponentsBuilder uriBuileder, HttpServletResponse response) {
//        Page<Bookkk> resultPage = bookkkkService.findPaginated(page, size);
//
//        return ResponseEntity.ok(this.bookkkkService.getQuizzes());
//    }
//


    //get single quiz
    @GetMapping("/{qid}")
    public Bookkk quiz(@PathVariable("qid") Long qid) {
        return this.bookkkkService.getBook(qid);
    }

    //delete the quiz
    @DeleteMapping("/{qid}")
    public void delete(@PathVariable("qid") Long qid) {
        this.bookkkkService.deleteBook(qid);
    }

    @GetMapping("/category/{cid}")
    public List<Bookkk> getQuizzesOfCategory(@PathVariable("cid") Long cid) {
        Category category = new Category();
        category.setCid(cid);
        return this.bookkkkService.getBooksOfCategory(category);
    }

    //get active quizzes
    @GetMapping("/active")
    public List<Bookkk> getActiveQuizzes() {
        return this.bookkkkService.getActiveBooks();
    }

    //get active quizzes of category
    @GetMapping("/category/active/{cid}")
    public List<Bookkk> getActiveQuizzes(@  PathVariable("cid") Long cid) {
        Category category = new Category();
        category.setCid(cid);
        return this.bookkkkService.getActiveBooksOfCategory(category);
    }




}
