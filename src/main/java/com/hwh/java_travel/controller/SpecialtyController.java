package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Specialty;
import com.hwh.java_travel.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:12
 **/
@Controller
@RequestMapping("/specialty")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Specialty> findAll(){
        return specialtyService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Specialty findById(Integer id){
        return specialtyService.findById(id);
    }
}
