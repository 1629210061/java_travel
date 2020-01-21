package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description 评论类
 * @Author hwh
 * @Date 2020/1/21 14:36
 **/
@Mapper
public interface CommentMapper {

    @Select("select * from comments where comm_name=#{name}")
    public List<Comment> findByName(String name);

    @Insert("insert into comments(nickname,avatraurl,content,images,comm_name) values(#{nickname},#{avatraurl},#{content},#{images},#{comm_name})")
    public Integer addComment(Comment comment);
}
