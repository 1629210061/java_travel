package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Agritainment;
import com.hwh.java_travel.service.AgritainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 21:39
 **/
@Controller
@RequestMapping("/agritainment")
public class AgritainmentController {

    @Autowired
    private AgritainmentService agritainmentService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Agritainment> findAll(){
        return agritainmentService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Agritainment findById(Integer id) {
        return agritainmentService.findById(id);
    }
}
