package com.roche.minimars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniMarsAPI {

    @RequestMapping("/mars.go")
    public String go(){
        return "Hi! I am Mars !";
    }
}
