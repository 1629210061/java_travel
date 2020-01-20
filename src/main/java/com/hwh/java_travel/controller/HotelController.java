package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Hotel;
import com.hwh.java_travel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:16
 **/
@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Hotel> findAll() {
        return hotelService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Hotel findById(Integer id) {
        return hotelService.findById(id);
    }
}
