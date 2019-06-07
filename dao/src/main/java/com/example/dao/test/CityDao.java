package com.example.dao.test;


import com.example.beans.test.CityEntity;

import javax.annotation.Resource;

public class CityDao {
    @Resource
    private CityEntity city;
    public String show(){
        return city.getName() + "this is dao";
    }

}
