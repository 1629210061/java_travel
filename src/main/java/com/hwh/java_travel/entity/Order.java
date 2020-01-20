package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:25
 **/
@Data
public class Order {

    private Integer id;
    private String time;
    private String name;
    private Float price;
    private String limited;
    private Integer amount;
    private Integer userid;
    private String ticketcode;
    private String QRcode;
    private String ordertype;
    private String picurl;

}
