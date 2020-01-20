package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Order;
import com.hwh.java_travel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/20 21:40
 **/
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/findAllOrder")
    public List<Order> findAllOrder(Integer userid){
        System.out.println(userid);
        return orderService.findAllOrder(userid);
    }


    @ResponseBody
    @RequestMapping("/addOrder")
    public Integer addOrder(Order order){
        return orderService.addOrder(order);
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Order findById(Integer id){
        return orderService.findById(id);
    }
}
