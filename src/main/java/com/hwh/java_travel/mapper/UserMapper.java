package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 15:40
 **/
@Mapper
public interface UserMapper {

    @Select("select * from users where openid=#{openid}")
    public User findByOpenid(String openid);

    @Insert("insert into users(openid,session_key,avatarurl,nickname,city,country,gender,language,province) values(#{openid},#{session_key},#{avatarurl},#{nickname},#{city},#{country},#{gender},#{language},#{province})")
    public void addUser(User user);


}
