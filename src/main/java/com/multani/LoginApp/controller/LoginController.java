package com.multani.LoginApp.controller;/*
 *author: Preet
 */

import com.multani.LoginApp.model.User;
import com.multani.LoginApp.service.UserServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

     private final UserServiceIF service;

     @Autowired
     public LoginController(UserServiceIF service) {
         this.service = service;
     }

     @GetMapping("/user")
     public String getUserPassword(@RequestParam(name="username") String username) {
         User user = service.getUserByUsername(username);

         return user != null ? user.getPassword() : "";
     }
}
