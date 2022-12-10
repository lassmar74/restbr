package com.lasmarahmed.restbr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationCotroller {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
