package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Attraction;
import com.hwh.java_travel.entity.Collect;
import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.mapper.AttractionMapper;
import com.hwh.java_travel.mapper.CollectMapper;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 13:00
 **/
@Service("collectService")
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AttractionMapper attractionMapper;

    @Override
    public List<Collect> findByUserId(Integer userId) {
        return collectMapper.findByUserId(userId);
    }

    @Override
    public Collect findById(Integer id) {
        return collectMapper.findById(id);
    }

    /**
     * 添加订单
     * @param openid
     * @param name
     * @return
     */
    @Override
    public Integer addCollect(String openid,String name) {
        Collect collect = new Collect();
        User user = userMapper.findByOpenid(openid);
        Attraction attraction = attractionMapper.findByName(name);
        collect.setUserid(user.getId());
        collect.setName(name);
        collect.setPicurl(attraction.getPicurl());
        System.out.println(collect);
        try {
            return collectMapper.addCollect(collect);
        }catch (Exception e){
            return 0;
        }


    }

    @Override
    public Integer delCollect(Integer id) {
        return collectMapper.delCollect(id);
    }
}
