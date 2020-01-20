package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Guide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 18:52
 **/
@Mapper
public interface GuideMapper {

    @Select("select * from guide")
    public List<Guide> findAll();

    @Select("select * from guide where id=#{id}")
    public Guide findById(Integer id);
}
