package com.tantao.boot.controller;

import com.tantao.boot.bean.People;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @PostMapping("/saveuser")
    public People saveuser(People people){
        return people;
    }

}
