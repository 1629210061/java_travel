package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Food;
import com.hwh.java_travel.mapper.FoodMapper;
import com.hwh.java_travel.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:49
 **/
@Service("foodService")
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> findAll() {
        return foodMapper.findAll();
    }

    @Override
    public Food findById(Integer id) {
        return foodMapper.findById(id);
    }

    @Override
    public List<Food> findByName(String name) {
        name = "%"+name+"%";
        return foodMapper.findByName(name);
    }
}
