package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Strategy;
import com.hwh.java_travel.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:53
 **/
@Controller
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Strategy> findAll(){
        return strategyService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Strategy findById(Integer id){
        return strategyService.findById(id);
    }

    @RequestMapping("/addStrategy")
    public void addStrategy(String nickname, String title, String content, String avatarurl, String imgurl){
        System.out.println("ccc");
//        strategyService.addStrategy(userid,nickname,title,content,avatarurl,imgurl);
    }

}
