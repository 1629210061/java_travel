package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:54
 **/
@Mapper
public interface HotelMapper {

    @Select("select * from hotels")
    public List<Hotel> findAll();

    @Select("select * from hotels where id=#{id}")
    public Hotel findById(Integer id);
}
