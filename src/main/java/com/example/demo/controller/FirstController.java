package com.example.demo.controller;

import com.example.demo.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("firstController/")
public class FirstController {

    private StringService stringService;

    @Autowired
    public FirstController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("getOk/{name}")
    public String getSimpleString(@PathVariable String name) {
        return stringService.produceName(name);
    }

}
