package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description 导游预定
 * @Author hwh
 * @Date 2020/1/20 21:31
 **/
@Data
public class GuideBook {

    private Integer id;
    private String time;
    private String name;
    private String starttime;
    private String ordername;
    private String tel;
    private String message;
}
