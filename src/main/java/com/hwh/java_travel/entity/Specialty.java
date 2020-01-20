package com.hwh.java_travel.entity;

import lombok.Data;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 21:55
 **/

@Data
public class Specialty {
    private Integer id;
    private String name;
    private Float price;
    private String detail_pic;
    private String parameter;
    private String link;
    private String lb_pic;
    private String fm_pic;
}
