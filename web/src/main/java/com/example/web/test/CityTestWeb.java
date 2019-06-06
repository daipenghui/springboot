package com.example.web.test;

import com.example.beans.test.CityTestEntity;
import com.example.iservice.test.ICityTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityTestWeb {
    private ICityTest iCityTest;

    @RequestMapping("show")
    public String show(){
        CityTestEntity c = new CityTestEntity();
        return  iCityTest.show(c) + "this is web";
    }
}
