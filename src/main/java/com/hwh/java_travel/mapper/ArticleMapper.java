package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;


/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 15:20
 **/
@Mapper
public interface ArticleMapper {
    /**
     * 根据类型搜索文章
     * @return
     */
    @Select("select * from article where type=#{type}")
    public List<Article> findByType(Integer type);

    /**
     * 地域概况的一个地域的概述
     * @param type
     * @param name
     * @return
     */
    @Select("select * from article where type = #{type} and title = #{name}")
    public Article findSituation(@Param("type") Integer type, @Param("name") String name);

    /**
     * 根据id查找具体的文章
     * @param id
     * @return
     */
    @Select("select * from article where id=#{id}")
    public Article findById(Integer id);

}
