package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:46
 **/
@Data
public class User {

    private Integer id;
    private String openid;
    private String session_key;
    private String orderid;
    private String nickname;
    private String city;
    private String country;
    private String province;
    private String language;
    private String gender;
    private String avatarurl;
    private String browserecord;

}
