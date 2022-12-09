package com.multani.LoginApp.controller;

/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;
import com.multani.LoginApp.service.UserServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private final UserServiceIF service;

    @Autowired
    public RegisterController(UserServiceIF service) {
        this.service = service;
    }

    @PostMapping("/userdata")
    public void saveUserData(@RequestBody User user) {
        service.saveNewUserData(user);
    }

    @GetMapping("/getuser_with_username")
    public void getUserByUsername(@RequestBody String username) { service.getUserByUsername(username); }

    @GetMapping("/getuser_with_password")
    public void getUserByPassword(@RequestBody String password) { service.getUserByPassword(password); }

    @GetMapping("/getuser_with_email")
    public void getUserByEmail(@RequestBody String email) { service.getUserByEmail(email); }
}
