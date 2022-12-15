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

    @GetMapping("/exist_username")
    public boolean containUsernameInDB(@RequestParam(name="username") String username) {
         return service.getUserByUsername(username) != null ? true : false;
    }

    @GetMapping("/exist_password")
    public boolean containPasswordInDB(@RequestParam(name="password") String password) {
        return service.getUserByPassword(password) != null ? true : false;
    }

    @GetMapping("/exist_email")
    public boolean containEmailInDB(@RequestParam(name="email") String email) {
        return service.getUserByEmail(email) != null ? true : false;
    }
}
