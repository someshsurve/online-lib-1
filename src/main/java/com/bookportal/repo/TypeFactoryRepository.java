package com.bookportal.repo;

import com.bookportal.model.classbookordered.TypeFactor;
import com.bookportal.model.classbookordered.Bookkk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TypeFactoryRepository extends JpaRepository<TypeFactor, Long> {
    Set<TypeFactor> findByBookkk(Bookkk bookkk);
}
