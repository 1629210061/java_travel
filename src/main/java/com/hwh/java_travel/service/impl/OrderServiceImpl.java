package com.hwh.java_travel.service.impl;

import com.hwh.java_travel.entity.GuideBook;
import com.hwh.java_travel.entity.Order;
import com.hwh.java_travel.mapper.OrderMapper;
import com.hwh.java_travel.mapper.UserMapper;
import com.hwh.java_travel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:39
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Order> findAllOrder(Integer userId) {
        return orderMapper.findAllOrder(userId);
    }

    @Override
    public Integer addOrder(String openid,Order order) {
        Integer userId = userMapper.findByOpenid(openid).getId();
        order.setUserid(userId);
        return orderMapper.addOrder(order);
    }

    @Override
    public Order findById(Integer id) {
        return orderMapper.findById(id);
    }

    @Override
    public Integer addGuideBook(GuideBook guideBook) {
        return orderMapper.addGuideBook(guideBook);
    }
}
