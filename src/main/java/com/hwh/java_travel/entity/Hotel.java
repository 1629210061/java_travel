package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description 酒店类
 * @Author hwh
 * @Date 2020/1/19 14:46
 **/
@Data
public class Hotel {

    private Integer id;
    private String cn_name;
    private String in_day;
    private String out_day;
    private String address;
    private Float unit_price;
    private String facilities;
    private String tip;
    private Integer surplus;
    private String lb_images;
    private String dt_images;
    private String traffic_images;
    private String score;
    private String eg_name;
    private String fm_images;
    private String introduce;
    private String longitude;
    private String latitude;

}
