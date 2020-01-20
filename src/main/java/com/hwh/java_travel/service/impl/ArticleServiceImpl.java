package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.Article;
import com.hwh.java_travel.mapper.ArticleMapper;
import com.hwh.java_travel.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 16:08
 **/
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findByType(Integer type) {
        return articleMapper.findByType(type);
    }

    @Override
    public Article findSituation(Integer type, String name) {
        return articleMapper.findSituation(type,name);
    }

    @Override
    public Article findById(Integer id) {
        return articleMapper.findById(id);
    }
}
