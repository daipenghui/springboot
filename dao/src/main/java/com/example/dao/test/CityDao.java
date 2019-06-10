package com.example.dao.test;


import com.example.beans.test.CityEntity;

public class CityDao {
     public String show(){
          CityEntity cityEntity = new CityEntity();
          return cityEntity.getName() + "this is dao";
     };

}
