package com.multani.LoginApp.service;/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;
import com.multani.LoginApp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceIF{

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public void saveNewUserData(User user) {
        repo.save(user);
    }

    public User getUserByUsername(String username) {
        return repo.findUserByUsername(username);
    }

    public User getUserByPassword(String password) {
        return repo.findUserByPassword(password);
    }

    public User getUserByEmail(String email) {
        return repo.findUserByEmail(email);
    }
}
