package com.bookportal.model.classbookordered;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bookkk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qId;
    private String bookauthor;

//    @Column(length = 5000)
    private String booktitle;
    private String title;
    private String description;
    private String maxMarks;
    private String numberOfQuestions;

    private String imageurll;

    private String isbn;
    private String publisher;
    private String yearofpublication;

    private boolean active = false;
    //add..

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @OneToMany(mappedBy = "bookkk", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TypeFactor> typeFactors = new HashSet<>();


    public Bookkk() {
    }

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<TypeFactor> getQuestions() {
        return typeFactors;
    }

    public void setQuestions(Set<TypeFactor> typeFactors) {
        this.typeFactors = typeFactors;
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
}
