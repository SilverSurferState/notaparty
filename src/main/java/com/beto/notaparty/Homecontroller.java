package com.beto.notaparty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {


    @GetMapping("/")
    public String getHome(){
        return "home";
    }

}
