package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Car;
import com.hwh.java_travel.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:41
 **/
@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Car> findAll(){
        return carService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Car findById(Integer id){
        return carService.findById(id);
    }

}
