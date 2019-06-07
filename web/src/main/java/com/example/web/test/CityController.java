package com.example.web.test;

import com.example.serviceimpl.test.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping("/show")
    public String show(){
        String str =  cityService.show();
        return str;
    }
}
