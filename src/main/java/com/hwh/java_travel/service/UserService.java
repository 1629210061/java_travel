package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.User;
import org.springframework.boot.configurationprocessor.json.JSONObject;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 15:46
 **/
public interface UserService {

    public User findByOpenid(String openid);

    public String getOpenid(String code);

    public void addUser(User user);

    /**
     * 更新浏览记录
     * @param record
     * @param openid
     * @return
     */
    public Integer updateRecord(String record,String openid);
}
