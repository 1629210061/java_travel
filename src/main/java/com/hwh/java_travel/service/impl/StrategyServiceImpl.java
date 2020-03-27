package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Strategy;
import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.mapper.StrategyMapper;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:52
 **/
@Service("strategyService")
public class StrategyServiceImpl implements StrategyService {

    @Autowired
    private StrategyMapper strategyMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Strategy> findAll() {
        List<Strategy> strategies = strategyMapper.findAll();
        for(Strategy strategy:strategies){
            if(strategy.getImgurl()!=null&&!"".equals(strategy.getImgurl())){
                String[] imgurl = strategy.getImgurl().split(",");
                List<String> imgList = Arrays.asList(imgurl);
                strategy.setImgList(imgList);
            }

        }
        return strategies;
    }

    @Override
    public Strategy findById(Integer id) {
        return strategyMapper.findById(id);
    }

    @Override
    public Integer addStrategy(String openid,Strategy strategy) {
        Integer userid = userMapper.findByOpenid(openid).getId();
        strategy.setUserid(userid);
        strategy.setImgurl(strategy.getImgurl());
        return strategyMapper.addStrategy(strategy);
    }


}
