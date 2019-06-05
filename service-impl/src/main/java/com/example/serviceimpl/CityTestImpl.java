package com.example.serviceimpl;

import com.example.dao.CityTestDao;
import com.example.iservice.ICityTest;


public class CityTestImpl implements ICityTest {

    @Override
    public String show() {
        CityTestDao c = new CityTestDao();
        return c.show() + "this is impl";
    }
}
