package com.example.web;

import com.example.web.test.CityController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan
public class WebApplicationTests {

    @Autowired
    private CityController controller;
    @Test
    public void contextLoads() {
        controller.show();
    }

}
