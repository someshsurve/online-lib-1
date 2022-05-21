package com.bookportal.repo;

import com.bookportal.model.UserPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPageRepository extends JpaRepository<UserPage, Long> {
}
