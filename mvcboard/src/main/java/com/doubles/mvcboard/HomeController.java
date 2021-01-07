package com.doubles.mvcboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Locale locale, Model model){
        model.addAttribute("greeting", "hello world");
        return "home";
    }

}