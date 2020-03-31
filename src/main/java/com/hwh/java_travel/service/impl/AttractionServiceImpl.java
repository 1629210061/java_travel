package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Attraction;
import com.hwh.java_travel.entity.Collect;
import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.mapper.AttractionMapper;
import com.hwh.java_travel.mapper.CollectMapper;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    @Autowired
    private CollectMapper collectMapper;


    @Override
    public List<Attraction> findRandom() {
        List<Attraction> attractions =  attractionMapper.findRandom();
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

    @Override
    public List<Attraction> recommendAttraction(String openid) {
        User user = userMapper.findByOpenid(openid);
        Integer userId = user.getId();
        List<Collect> collectList = collectMapper.findByUserId(userId);
        List<Attraction> attractionList = attractionMapper.findAll();
        for(Collect collect:collectList){
            Attraction collectAttraction = attractionMapper.findByName(collect.getName());
            Integer score = 0;
            for(Attraction attraction:attractionList){
                if(collectAttraction.getArea().equals(attraction.getArea())){
                    score+=1;
                }
                if(collectAttraction.getCategory().equals(attraction.getCategory())){
                    score+=1;
                }
                attraction.setScore(score);
            }
        }
        Collections.sort(attractionList, new Comparator<Attraction>() {
            @Override
            public int compare(Attraction o1, Attraction o2) {
                return o2.getScore().compareTo(o1.getScore());
            }
        });
        List<Attraction> recommendAttraction = attractionList.subList(0,10);
        return recommendAttraction;
    }


}
