package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Article;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 16:08
 **/

public interface ArticleService {
    /**
     * 根据类型搜索文章
     * @return
     */
    public List<Article> findByType(Integer type);

    /**
     * 地域概况的一个地域的概述
     * @param type
     * @param name
     * @return
     */
    public Article findSituation(Integer type,String name);

    /**
     * 根据id查找具体的文章
     * @param id
     * @return
     */
    public Article findById(Integer id);
}
