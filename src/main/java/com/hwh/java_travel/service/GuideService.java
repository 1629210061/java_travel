package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Guide;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:12
 **/
public interface GuideService {

    public List<Guide> findAll();

    public Guide findById(Integer id);
}
