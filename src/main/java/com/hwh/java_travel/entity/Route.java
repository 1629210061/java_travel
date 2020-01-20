package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description 路线类
 * @Author hwh
 * @Date 2020/1/19 14:50
 **/
@Data
public class Route {
    private Integer id;
    private String name;
    private String last_time;
    private String season;
    private String introduce;
    private String route;
    private String pic;
    private String fm_image;
}
