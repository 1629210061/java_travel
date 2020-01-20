package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Food;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:41
 **/
public interface FoodService {

    public List<Food> findAll();

    public Food findById(Integer id);

    public List<Food> findByName(String name);
}
