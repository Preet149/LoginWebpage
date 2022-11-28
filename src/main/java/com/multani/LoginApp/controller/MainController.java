package com.multani.LoginApp.controller;/*
 *author: Preet
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/loginpage")
    public String openLoginPage() {
        return "loginpage";
    }

    @GetMapping("/registerpage")
    public String openRegisterPage() {
        return "registerpage";
    }
}
