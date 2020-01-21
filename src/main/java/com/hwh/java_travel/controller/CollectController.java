package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Collect;
import com.hwh.java_travel.service.CollectService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 13:03
 **/
@Controller
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @ResponseBody
    @RequestMapping("/findByUserId")
    public List<Collect> findByUserId(Integer userid){
        return collectService.findByUserId(userid);
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Collect findById(Integer id){
        return collectService.findById(id);
    }

    @ResponseBody
    @RequestMapping("/addCollect")
    public Integer addCollect(String openid,String name){
        return collectService.addCollect(openid,name);
    }

    @ResponseBody
    @RequestMapping("/delCollect")
    public Integer delCollect(Integer id){
        return collectService.delCollect(id);
    }

}
