package com.example.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("test")
public class TestController {
    
    @GetMapping("testSecurity")
    public String testSecurity(){
        
        return "are you ok?";
    }
}
