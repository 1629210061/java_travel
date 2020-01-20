package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Specialty;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 11:39
 **/
@Mapper
public interface SpecialtyMapper {

    @Select("select * from specialty")
    public List<Specialty> findAll();

    @Select("select * from specialty where id=#{id}")
    public Specialty findById(Integer id);
}
