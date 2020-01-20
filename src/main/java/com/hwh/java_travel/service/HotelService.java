package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Hotel;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:12
 **/
public interface HotelService {
    public List<Hotel> findAll();

    public Hotel findById(Integer id);

}
