package com.multani.LoginApp.controller;/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;
import com.multani.LoginApp.service.UserServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

     private final UserServiceIF service;

     @Autowired
     public LoginController(UserServiceIF service) {
         this.service = service;
     }

    /* @GetMapping("/getuser")
     public User getUserData(@RequestBody User user) {
         return service.getUser(user.getUsername());
     }*/
}
