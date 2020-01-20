package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:37
 **/

@Mapper
public interface CarMapper {

    @Select("select * from cars")
    public List<Car> findAll();

    @Select("select * from cars where id=#{id}")
    public Car findById(Integer id);
}
