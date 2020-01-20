package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Attraction;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;


import java.awt.*;
import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/18 15:29
 **/

@Mapper
public interface AttractionMapper {

    /**
     * 推荐景区获取
     * @return
     */
    @Select("select * from attractions where level='AAAAA'||level='AAAA'")
    public List<Attraction> findRandom();

    /**
     * 根据名字获取景点
     * @param name
     * @return
     */
    @Select("select * from attractions where cn_name=#{name}")
    public Attraction findByName(String name);

    /**
     * 根据地区获取景点
     * @param area
     * @return
     */
    @Select("select * from attractions where area=#{area}")
    public List<Attraction> findByArea(String area);

    /**
     * 根据地区获取景点
     * @param category
     * @return
     */
    @Select("select * from attractions where category=#{category}")
    public List<Attraction> findByCategory(String category);

    /**
     * 根据分类和名称获取景点
     * @param category
     * @param name
     * @return
     */
    @Select("select * from attractions where category=#{category} and cn_name like #{name}")
    public List<Attraction> findByCategoryAndName(String category,String name);

    /**
     * 根据地区和名称获取景点
     * @param area
     * @param name
     * @return
     */
    @Select("select * from attractions where area=#{area} and cn_name like #{name}")
    public List<Attraction> findByAreaAndName(String area,String name);

    /**
     * 获取全部景点
     * @return
     */
    @Select("select * from attractions")
    public List<Attraction> findAll();

    /**
     * 通过id获取景点
     * @return
     */
    @Select("select * from attractions where id = #{id}")
    public Attraction findById();
}
