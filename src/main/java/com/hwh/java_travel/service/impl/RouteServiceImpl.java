package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Route;
import com.hwh.java_travel.mapper.RouteMapper;
import com.hwh.java_travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:14
 **/
@Service("routeService")
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteMapper routeMapper;

    @Override
    public List<Route> findAll() {
        return routeMapper.findAll();
    }

    @Override
    public Route findById(Integer id) {
        return routeMapper.findById(id);
    }

}
