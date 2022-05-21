package com.bookportal.repo;

import com.bookportal.model.classbookordered.Category;
import com.bookportal.model.classbookordered.Bookkk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookkRepository extends JpaRepository<Bookkk, Long> {
    public List<Bookkk> findBycategory(Category category);

    public List<Bookkk> findByActive(Boolean b);

    public List<Bookkk> findByCategoryAndActive(Category c, Boolean b);

}
