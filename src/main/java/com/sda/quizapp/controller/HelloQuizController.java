package com.sda.quizapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@Deprecated
public class HelloQuizController {

    @GetMapping("/")
    public String hello(){
      return "App works";
    }
}
