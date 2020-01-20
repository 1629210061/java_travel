package com.hwh.java_travel.entity;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 14:23
 **/
@Data
public class Agritainment {

    private Integer id;
    private String name;
    private String time;
    private Float price;
    private String address;
    private String tel;
    private String lb_images;
    private String dt_images;
    private String traffic_images;
    private String score;
    private String longitude;
    private String latitude;
    private String fm_images;
}
