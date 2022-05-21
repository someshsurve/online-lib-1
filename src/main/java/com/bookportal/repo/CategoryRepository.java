package com.bookportal.repo;

import com.bookportal.model.classbookordered.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
