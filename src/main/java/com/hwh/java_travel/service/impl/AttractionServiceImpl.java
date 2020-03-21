package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Attraction;
import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.mapper.AttractionMapper;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/18 15:34
 **/
@Service("attractionService")
public class AttractionServiceImpl implements AttractionService {

    @Autowired
    private AttractionMapper attractionMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Attraction> findRandom() {
        List<Attraction> attractions =  attractionMapper.findRandom();
        for(Attraction attraction:attractions){
            String[] pics = attraction.getLb_pictures().split("&");
            attraction.setPicurl(pics[0]);
        }

        return attractions;
    }

    @Override
    public List<Attraction> findAll() {
        return null;
    }

    @Override
    public Attraction findByName(String name) {

        return attractionMapper.findByName(name);
    }

    @Override
    public List<Attraction> findByArea(String area) {
        return attractionMapper.findByArea(area);
    }

    @Override
    public List<Attraction> findByCategory(String category) {
        return attractionMapper.findByCategory(category);
    }

    @Override
    public List<Attraction> findByCategoryAndName(String category, String name) {
        name = "%"+name+"%";
        System.out.println(name);
        return attractionMapper.findByCategoryAndName(category,name);
    }

    @Override
    public List<Attraction> findByAreaAndName(String area, String name) {
        name = "%"+name+"%";
        return attractionMapper.findByAreaAndName(area,name);
    }

    @Override
    public Attraction findById() {
        return attractionMapper.findById();
    }

//    @Override
//    public List<Attraction> pushRecommend(String openid) {
//        User user = userMapper.findByOpenid(openid);
//        List<String> records = Arrays.asList(user.getBrowserecord().split("&"));
//        List<Attraction> attractions = attractionMapper.findAll();
//
//        return null;
//    }


}
