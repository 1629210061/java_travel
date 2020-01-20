package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description 食品类
 * @Author hwh
 * @Date 2020/1/19 14:55
 **/
@Data
public class Food {

    private Integer id;
    private String name;
    private String address;
    private String telephone;
    private String time;
    private String price;
    private String fm_pic;
    private String detail_pic;
    private String recommend_pic;
    private String recommend;
    private String comment;
    private String score;
    private String area;
    private String cuisine;
}
