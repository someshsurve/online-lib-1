package com.bookportal.service;

import com.bookportal.model.classbookordered.Bookkk;
import com.bookportal.model.classbookordered.Category;

import java.util.List;
import java.util.Set;

public interface BookkkkService {

    public Bookkk addBook(Bookkk bookkk);

    public Bookkk updateBook(Bookkk bookkk);

    public Set<Bookkk> getBooks();

    public Bookkk getBook(Long quizId);

    public void deleteBook(Long quizId);


    public List<Bookkk> getBooksOfCategory(Category category);

    public List<Bookkk> getActiveBooks();

    public List<Bookkk> getActiveBooksOfCategory(Category c);
}
