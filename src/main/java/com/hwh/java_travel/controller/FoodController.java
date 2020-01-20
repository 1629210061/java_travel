package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Food;
import com.hwh.java_travel.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Food> findAll(){
        return foodService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Food findById(Integer id){
        return foodService.findById(id);
    }

    @ResponseBody
    @RequestMapping("/findByName")
    public List<Food> findByName(String name){
        return foodService.findByName(name);
    }

}
