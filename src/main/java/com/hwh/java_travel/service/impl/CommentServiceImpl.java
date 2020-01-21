package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Comment;
import com.hwh.java_travel.mapper.CommentMapper;
import com.hwh.java_travel.service.CollectService;
import com.hwh.java_travel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 14:39
 **/
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findByName(String name) {
        return commentMapper.findByName(name);
    }

    @Override
    public Integer addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }
}
