package com.hwh.java_travel.mapper;

import com.hwh.java_travel.entity.GuideBook;
import com.hwh.java_travel.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:32
 **/
@Mapper
public interface OrderMapper {

    @Select("select * from orders where userid=#{userid}")
    public List<Order> findAllOrder(Integer userid);

    @Select("select * from orders where id=#{id}")
    public Order findById(Integer id);

    @Insert("insert into orders(time,name,price,limited,amount,userid,ticketcode,ordertype,picurl) values(#{time},#{name},#{price},#{limited},#{amount},#{userid},#{ticketcode},#{ordertype},#{picurl})")
    public Integer addOrder(Order order);

    @Insert("insert into book(time,name,starttime,endtime,ordername,tel,message) values(#{time},#{name},#{starttime},#{endtime},#{ordername},#{tel},#{message})")
    public Integer addGuideBook(GuideBook guideBook);


}
