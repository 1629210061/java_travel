package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 16:29
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/findByOpenid")
    public User findByOpenid(String openid){
        return userService.findByOpenid(openid);
    }


    @ResponseBody
    @RequestMapping("/getOpenid")
    public String getOpenid(String code){
        return userService.getOpenid(code);
    }

    @RequestMapping("/addUser")
    public void addUser(User user){
        System.out.println(user);
        userService.addUser(user);
    }
}
