package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.Strategy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 12:51
 **/
@Mapper
public interface StrategyMapper {

    @Select("select * from strategy")
    public List<Strategy> findAll();

    @Select("select * from strategy where id=#{id}")
    public Strategy findById(Integer id);

    @Insert("insert into strategy(userid,nickname,title,content,avatarurl,imgurl) values(#{userid},#{nickname},#{title},#{content},#{avatarurl},#{imgurl})")
    public void addStrategy(Integer userid,String nickname,String title,String content,String avatarurl,String imgurl);
}
