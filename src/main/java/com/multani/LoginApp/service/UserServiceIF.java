package com.multani.LoginApp.service;/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;

public interface UserServiceIF {

    public void saveNewUserData(User user);

    public User getUser(String username);
}
