package com.hwh.java_travel.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:43
 **/
@Data
public class Strategy {

    private Integer id;
    private Integer userid;
    private String nickname;
    private String title;
    private String content;
    private String avatarurl;
    private String imgurl;
    private List<String> imgList;

}
