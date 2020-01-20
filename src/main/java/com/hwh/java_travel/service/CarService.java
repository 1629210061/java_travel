package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Car;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:39
 **/

public interface CarService {

    public List<Car> findAll();

    public Car findById(Integer id);

}
