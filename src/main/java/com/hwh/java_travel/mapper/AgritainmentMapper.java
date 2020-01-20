package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Agritainment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:55
 **/
@Mapper
public interface AgritainmentMapper {

    @Select("select * from agritainments")
    public List<Agritainment> findAll();

    @Select("select * from agritainments where id=#{id}")
    public Agritainment findById(Integer id);
}
