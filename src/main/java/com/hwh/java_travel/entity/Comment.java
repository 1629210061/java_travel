package com.hwh.java_travel.entity;

import lombok.Data;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:48
 **/
@Data
public class Comment {

    private Integer id;
    private String nickname;
    private String avatraurl;
    private String content;
    private String images;
    private String comm_name;
}
