package com.example.serviceimpl.test;

import com.example.beans.test.CityTestEntity;
import com.example.dao.test.CityTestDao;
import com.example.iservice.test.ICityTest;

public class CityTestImpl implements ICityTest {
    private CityTestDao cityTestDao;
    @Override
    public String show(CityTestEntity cte) {
        return cityTestDao.show(cte) + "this is impl";
    }
}
