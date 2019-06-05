package com.example.web;

import com.example.serviceimpl.CityTestImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityTestWeb {

    @RequestMapping("show")
    public String show(){
        CityTestImpl c = new CityTestImpl();
        return  c.show() + "this is web";
    }
}
