package com.multani.LoginApp.service;/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;

public interface UserServiceIF {

    public void saveNewUserData(User user);

    public User getUserByUsername(String username);

    public User getUserByPassword(String password);

    public User getUserByEmail(String email);
}
