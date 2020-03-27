package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Collect;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/21 12:39
 **/
@Mapper
public interface CollectMapper {

    @Select("select * from collects where userid=#{id}")
    public List<Collect> findByUserId(Integer userId);

    @Select("select * from collects where id=#{id}")
    public Collect findById(Integer id);

    @Insert("insert into collects(userid,name,picurl) values(#{userid},#{name},#{picurl})")
    public Integer addCollect(Collect collect);

    @Delete("delete from collects where id=#{id}")
    public Integer delCollect(Integer id);

}
