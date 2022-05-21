package com.bookportal.service.impl;

import com.bookportal.model.UserPage;
import com.bookportal.repo.UserPageRepository;
import com.bookportal.service.UserPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserPageServiceImpl implements UserPageService {

    @Autowired
    private UserPageRepository userPageRepository;

    @Override
    public UserPage addUserPage(UserPage page) {
        return this.userPageRepository.save(page);
    }

    @Override
    public UserPage updateUserPage(UserPage page) {
        return this.userPageRepository.save(page);
    }

    @Override
    public Set<UserPage> getUserPages() {
        return new HashSet<>(this.userPageRepository.findAll());
    }

    @Override
    public UserPage getUserPage(Long UserPageId) {
        return this.userPageRepository.findById(UserPageId).get();
    }

    @Override
    public void deleteUserPage(Long UserPageId) {
        this.userPageRepository.deleteById(UserPageId);
    }
}
