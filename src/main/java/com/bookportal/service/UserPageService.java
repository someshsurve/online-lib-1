package com.bookportal.service;

import com.bookportal.model.UserPage;

import java.util.Set;

public interface UserPageService {
    public UserPage addUserPage(UserPage page);

    public UserPage updateUserPage(UserPage page);

    public Set<UserPage> getUserPages();

    public UserPage getUserPage(Long UserPageId);

    public void deleteUserPage(Long UserPageId);
}
