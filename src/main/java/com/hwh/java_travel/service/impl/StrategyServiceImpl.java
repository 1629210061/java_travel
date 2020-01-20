package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Strategy;
import com.hwh.java_travel.mapper.StrategyMapper;
import com.hwh.java_travel.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:52
 **/
@Service("strategyService")
public class StrategyServiceImpl implements StrategyService {

    @Autowired
    private StrategyMapper strategyMapper;

    @Override
    public List<Strategy> findAll() {
        return strategyMapper.findAll();
    }

    @Override
    public Strategy findById(Integer id) {
        return strategyMapper.findById(id);
    }

    @Override
    public void addStrategy(Integer userid, String nickname, String title, String content, String avatarurl, String imgurl) {
        strategyMapper.addStrategy(userid,nickname,title,content,avatarurl,imgurl);
    }


}
