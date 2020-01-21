package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.GuideBook;
import com.hwh.java_travel.entity.Order;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:38
 **/
public interface OrderService {

    public List<Order> findAllOrder(Integer userId);

    public Integer addOrder(String openid,Order order);

    public Order findById(Integer id);

    public Integer addGuideBook(GuideBook guideBook);
}
