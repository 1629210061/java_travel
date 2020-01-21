package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Comment;
import com.hwh.java_travel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 14:41
 **/
@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping("/findByName")
    public List<Comment> findByName(String name){
        return commentService.findByName(name);
    }

    @ResponseBody
    @RequestMapping("/addComment")
    public Integer addComment(Comment comment){
        return commentService.addComment(comment);
    }

}
