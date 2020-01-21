package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Collect;
import com.hwh.java_travel.entity.User;
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

    @Override
    public List<Collect> findByUserId(Integer userId) {
        return collectMapper.findByUserId(userId);
    }

    @Override
    public Collect findById(Integer id) {
        return collectMapper.findById(id);
    }

    @Override
    public Integer addCollect(String openid,String name) {
        Collect collect = new Collect();
        User user = userMapper.findByOpenid(openid);
        collect.setUserid(user.getId());
        collect.setName(name);
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
