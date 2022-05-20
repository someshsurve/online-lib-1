package com.exam.repo;

import com.exam.model.UserPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPageRepository extends JpaRepository<UserPage, Long> {
}
