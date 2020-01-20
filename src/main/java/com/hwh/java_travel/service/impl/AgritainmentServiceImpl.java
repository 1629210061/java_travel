package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Agritainment;
import com.hwh.java_travel.mapper.AgritainmentMapper;
import com.hwh.java_travel.service.AgritainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 21:34
 **/
@Service("agritainmentService")
public class AgritainmentServiceImpl implements AgritainmentService {

    @Autowired
    private AgritainmentMapper agritainmentMapper;

    @Override
    public List<Agritainment> findAll() {
        return agritainmentMapper.findAll();
    }

    @Override
    public Agritainment findById(Integer id) {
        return agritainmentMapper.findById(id);
    }
}
