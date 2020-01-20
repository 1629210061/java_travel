package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:38
 **/

@Mapper
public interface FoodMapper {

    @Select("select * from food")
    public List<Food> findAll();

    @Select("select * from food where id=#{id}")
    public Food findById(Integer id);

    @Select("select * from food where name like #{name}")
    public List<Food> findByName(String name);
}
