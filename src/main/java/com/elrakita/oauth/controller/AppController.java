package com.elrakita.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class AppController {
    
    @RequestMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }
}
