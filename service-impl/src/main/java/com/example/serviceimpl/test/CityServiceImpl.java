package com.example.serviceimpl.test;

import com.example.dao.test.CityDao;
import com.example.iservice.test.ICItyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CityServiceImpl implements ICItyService {

    @Override
    public String show() {
        CityDao city = new CityDao();
        String str =  city.show();
        return str + "this is impl";
    }
}
