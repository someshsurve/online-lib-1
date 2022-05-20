package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userPageId;

    private String bookauthor;
    private String booktitle;
    private String description;
    private String imageurll;
    private String isbn;
    private String publisher;
    private String yearofpublication;
    private boolean active = false;

    public UserPage() {
    }

    public UserPage(Long userPageId, String bookauthor, String booktitle, String description, String imageurll, String isbn, String publisher, String yearofpublication, boolean active) {
        this.userPageId = userPageId;
        this.bookauthor = bookauthor;
        this.booktitle = booktitle;
        this.description = description;
        this.imageurll = imageurll;
        this.isbn = isbn;
        this.publisher = publisher;
        this.yearofpublication = yearofpublication;
        this.active = active;
    }

    public Long getUserPageId() {
        return userPageId;
    }

    public void setUserPageId(Long userPageId) {
        this.userPageId = userPageId;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurll() {
        return imageurll;
    }

    public void setImageurll(String imageurll) {
        this.imageurll = imageurll;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(String yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
