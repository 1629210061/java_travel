package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Car;
import com.hwh.java_travel.mapper.CarMapper;
import com.hwh.java_travel.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:42
 **/
@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> findAll() {
        return carMapper.findAll();
    }

    @Override
    public Car findById(Integer id) {
        return carMapper.findById(id);
    }
}
