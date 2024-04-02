package com.example.demo.service.impl;

import com.example.demo.service.StringService;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {
    @Override
    public String produceName(String name) {
        return "Привет из сервиса " + name;
    }
}
