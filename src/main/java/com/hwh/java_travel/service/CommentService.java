package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Comment;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 14:36
 **/
public interface CommentService {

    public List<Comment> findByName(String name);

    public Integer addComment(Comment comment);
}
