package com.tanasiychuk.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/1")
    public String showFirstPage(Model model){
       // return "/WEB-INF/view/myFirstView.html";
        int i = 1;
    return "myFirstView";
    }
}
