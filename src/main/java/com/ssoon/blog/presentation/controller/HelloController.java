package com.ssoon.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String index(final Model model) {
        model.addAttribute("name", "SpringBlog from Ssoon");
        return "hello";
    }
}
