package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Agritainment;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 21:32
 **/
public interface AgritainmentService {

    public List<Agritainment> findAll();

    public Agritainment findById(Integer id);

}
