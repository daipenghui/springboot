package com.example.dao;

import com.example.beans.test.CityTestEntity;

public class CityTestDao {
    public String show(){
        CityTestEntity c = new CityTestEntity();
        return  c.getName() + "this is dao";
    }
}
