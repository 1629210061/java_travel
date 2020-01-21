package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Collect;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 12:59
 **/
public interface CollectService {

    public List<Collect> findByUserId(Integer userId);

    public Collect findById(Integer id);

    public Integer addCollect(String openid,String name);

    public Integer delCollect(Integer id);
}
