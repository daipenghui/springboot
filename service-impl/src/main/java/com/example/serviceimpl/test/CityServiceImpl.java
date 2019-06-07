package com.example.serviceimpl.test;

import com.example.dao.test.CityDao;
import com.example.iservice.test.ICItyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CityServiceImpl implements ICItyService {
    @Autowired
    private CityDao city;
    @Override
    public String show() {
        String str =  city.show();
        return str + "this is impl";
    }
}
