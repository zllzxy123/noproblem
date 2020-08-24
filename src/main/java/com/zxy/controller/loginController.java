package com.zxy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class loginController {
    @GetMapping("/do/{username}")
    public String dologin(@PathVariable("username")String username, Model model){
        model.addAttribute("name",username);
        return "index";
    }
}

