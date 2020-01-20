package com.hwh.java_travel.service;

import com.hwh.java_travel.entity.Order;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:38
 **/
public interface OrderService {

    public List<Order> findAllOrder(Integer userId);

    public Integer addOrder(Order order);

    public Order findById(Integer id);
}
