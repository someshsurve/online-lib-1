package com.exam.service;

import com.exam.model.UserPage;
import com.exam.model.exam.Quiz;

import java.util.Set;

public interface UserPageService {
    public UserPage addUserPage(UserPage page);

    public UserPage updateUserPage(UserPage page);

    public Set<UserPage> getUserPages();

    public UserPage getUserPage(Long UserPageId);

    public void deleteUserPage(Long UserPageId);
}
