package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description 文章类
 * @Author hwh
 * @Date 2020/1/19 14:20
 **/
@Data
public class Article {

    private Integer id;
    private String title;
    private String author;
    private String date;
    private String content;
    private String picurl;
    private String type;
    private String fm_url;

}
