package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.User;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.UserService;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 16:14
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByOpenid(String openid) {
        return userMapper.findByOpenid(openid);
    }

    @Override
    public String getOpenid(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/sns/jscode2session?"
                + "appid=wx2737877394bb7b80&"
                + "secret=6e4341f2ea22035c1ef663ede51d28a0"
                + "&js_code=" + code + "&grant_type=authorization_code";

        String json = restTemplate.getForObject(url,String.class);
        return json;
    }

    @Override
    public void addUser(User user) {

        if(user.getGender().equals("2")){
            user.setGender("女");
        }else {
            user.setGender("男");
        }
        userMapper.addUser(user);
    }

    /**
     * 跟新浏览记录
     * @param record
     * @param openid
     * @return
     */
    @Override
    public Integer updateRecord(String record,String openid) {
        User user = userMapper.findByOpenid(openid);
        String sRecord = user.getBrowserecord();
        if(!"".equals(sRecord)&&sRecord!=null){
            List<String> records = Arrays.asList(sRecord.split("&"));
            if(!records.contains(record)){
                sRecord+='&'+record;
            }
        }else {
            sRecord=record;
        }

        return userMapper.updateRecord(sRecord,openid);
    }
}
