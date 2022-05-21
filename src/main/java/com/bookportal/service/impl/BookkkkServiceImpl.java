package com.bookportal.service.impl;

import com.bookportal.model.classbookordered.Bookkk;
import com.bookportal.model.classbookordered.Category;
import com.bookportal.repo.BookkRepository;
import com.bookportal.service.BookkkkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class BookkkkServiceImpl implements BookkkkService {
    @Autowired
    private BookkRepository bookkRepository;

//

    @Override
    public Bookkk addBook(Bookkk bookkk) {
        return this.bookkRepository.save(bookkk);
    }

    @Override
    public Bookkk updateBook(Bookkk bookkk) {
        return this.bookkRepository.save(bookkk);
    }

    @Override
    public Set<Bookkk> getBooks() {
        return new HashSet<>(this.bookkRepository.findAll());
    }

    @Override
    public Bookkk getBook(Long bookId) {
        return this.bookkRepository.findById(bookId).get();
    }

    @Override
    public void deleteBook(Long bookId) {
        this.bookkRepository.deleteById(bookId);
    }

    @Override
    public List<Bookkk> getBooksOfCategory(Category category) {
        return this.bookkRepository.findBycategory(category);
    }


    //get active quizzes

    @Override
    public List<Bookkk> getActiveBooks() {
        return this.bookkRepository.findByActive(true);
    }

    @Override
    public List<Bookkk> getActiveBooksOfCategory(Category c) {
        return this.bookkRepository.findByCategoryAndActive(c, true);
    }


//    @Autowired
//    public Page<Bookkk> findAll(Pageable pageable) {
//        return this.quizRepositorys.findAll(pageable);
//    }
}
