package com.mycode.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping({"/","/index"})
    @ResponseBody
    public String test(){
        return "Hello World!";
    }
}
