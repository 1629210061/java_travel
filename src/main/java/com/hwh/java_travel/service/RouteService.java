package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Route;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:12
 **/
public interface RouteService {

    public List<Route> findAll();

    public Route findById(Integer id);

}
