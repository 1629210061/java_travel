package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Hotel;
import com.hwh.java_travel.mapper.HotelMapper;
import com.hwh.java_travel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:14
 **/
@Service("hotelService")
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<Hotel> findAll() {
        return hotelMapper.findAll();
    }

    @Override
    public Hotel findById(Integer id) {
        return hotelMapper.findById(id);
    }
}
