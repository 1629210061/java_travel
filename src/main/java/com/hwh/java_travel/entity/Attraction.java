package com.hwh.java_travel.entity;

import lombok.Data;
/**
 * @Description 景点类
 * @Author hwh
 * @Date 2020/1/19 14:20
 **/
@Data
public class Attraction {
	private Integer id;
	private String address;
	private String telephone;
	private String level;
	private String eg_name;
	private String area;
	private String cn_name;
	private String open_time;
	private String ticket;
	private Float ticket_price;
	private String lb_pictures;
	private String dt_pictures;
	private String introduce;
	private String traffic;
	private String traffic_pic;
	private String category;
	private String video_url;
	private String longitude;
	private String latitude;
	private String picurl;

	
}
