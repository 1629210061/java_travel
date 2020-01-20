package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Guide;
import com.hwh.java_travel.mapper.GuideMapper;
import com.hwh.java_travel.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:13
 **/
@Service("guideService")
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;

    @Override
    public List<Guide> findAll() {
        return guideMapper.findAll();
    }

    @Override
    public Guide findById(Integer id) {
        return guideMapper.findById(id);
    }
}
