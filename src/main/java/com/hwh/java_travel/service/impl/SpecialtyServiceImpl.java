package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Specialty;
import com.hwh.java_travel.mapper.SpecialtyMapper;
import com.hwh.java_travel.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:10
 **/
@Service("specialtyService")
public class SpecialtyServiceImpl implements SpecialtyService {

    @Autowired
    private SpecialtyMapper specialtyMapper;

    @Override
    public List<Specialty> findAll() {
        return specialtyMapper.findAll();
    }

    @Override
    public Specialty findById(Integer id) {
        return specialtyMapper.findById(id);
    }
}
