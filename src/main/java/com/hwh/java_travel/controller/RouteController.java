package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Route;
import com.hwh.java_travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.rmi.server.RemoteServer;
import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/19 20:50
 **/
@Controller
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Route> findAll(){
        return routeService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Route findById(Integer id){
        return routeService.findById(id);
    }
}
