package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Guide;
import com.hwh.java_travel.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 19:16
 **/
@Controller
@RequestMapping("/guide")
public class GuideController {

    @Autowired
    private GuideService guideService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Guide> findAll(){
        return guideService.findAll();
    }


    @ResponseBody
    @RequestMapping("/findById")
    public Guide findById(Integer id){
        return guideService.findById(id);
    }
}
