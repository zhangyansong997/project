package com.zys.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
    @RequestMapping("hello")
    public String hello(@RequestParam("xingming") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
