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
    public User getUserByUsername(@RequestBody User user) { return service.getUserByUsername(user.getUsername()); }

    @GetMapping("/getuser_with_password")
    public User getUserByPassword(@RequestBody User user) { return service.getUserByPassword(user.getPassword()); }

    @GetMapping("/getuser_with_email")
    public User getUserByEmail(@RequestBody User user) { return service.getUserByEmail(user.getEmail()); }
}
