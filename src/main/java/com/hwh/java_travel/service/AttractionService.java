package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Attraction;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description AttractionService
 * @Author hwh
 * @Date 2020/1/18 15:34
 **/

public interface AttractionService {

    /**
     * 推荐景点
     * @return
     */
    public List<Attraction> findRandom();

    /**
     * 获取全部景点
     * @return
     */
    public List<Attraction> findAll();

    /**
     * 根据名字获取景点
     * @param name
     * @return
     */
    public Attraction findByName(String name);

    /**
     * 根据地区获取景点
     * @param area
     * @return
     */
    public List<Attraction> findByArea(String area);

    /**
     * 根据地区获取景点
     * @param category
     * @return
     */
    public List<Attraction> findByCategory(String category);

    /**
     * 根据地区和名称获取景点
     * @param category
     * @param name
     * @return
     */
    public List<Attraction> findByCategoryAndName(String category,String name);

    /**
     * 根据地区和名称获取景点
     * @param area
     * @param name
     * @return
     */
    public List<Attraction> findByAreaAndName(String area,String name);
    /**
     * 通过id获取景点
     * @return
     */
    public Attraction findById();

    /**
     * 推荐景点
     * @param openid
     * @return
     */
//    public List<Attraction> pushRecommend(String openid);

}
