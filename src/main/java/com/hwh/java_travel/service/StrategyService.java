package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Strategy;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:52
 **/
public interface StrategyService {

    public List<Strategy> findAll();

    public Strategy findById(Integer id);

    public Integer addStrategy(String openid,Strategy strategy);
}
