package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Route;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:53
 **/
@Mapper
public interface RouteMapper {

    @Select("select * from route")
    public List<Route> findAll();

    @Select("select * from route where id=#{id}")
    public Route findById(Integer id);
}
