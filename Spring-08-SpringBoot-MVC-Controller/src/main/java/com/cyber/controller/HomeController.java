package com.cyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "Home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/ozzy")
    public String getRequestMapping2(){
        return "Home";
    }

    @GetMapping("/spring")
    public String getRequestMapping3(){
        return "Home";
    }

    @PostMapping("/post")
    public String getRequestMapping4(){
        return "Home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        return "Home";
    }
}
