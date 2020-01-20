package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Specialty;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:09
 **/
public interface SpecialtyService {

    public List<Specialty> findAll();

    public Specialty findById(Integer id);
}
