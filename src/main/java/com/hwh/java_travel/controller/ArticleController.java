package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Article;
import com.hwh.java_travel.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 16:12
 **/
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 根据类型搜索文章
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByType")
    public List<Article> findByType(Integer type) {
       return articleService.findByType(type);
    }

    /**
     * 根据id查找具体的文章
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/findById")
    public Article findById(Integer id){
        return articleService.findById(id);
    }

    /**
     * 地域概况
     * @param type
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/findSituation")
    public Article findSituation(Integer type,String name){
        return articleService.findSituation(type,name);
    }
}
