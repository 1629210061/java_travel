package com.hwh.java_travel.controller;

import com.hwh.java_travel.entity.Attraction;
import com.hwh.java_travel.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/1/18 15:36
 **/

@Controller
@RequestMapping("/attraction")
public class AttractionController {


    @Autowired
    private AttractionService attractionService;

    /**
     * 热门景点
     * @return
     */
    @ResponseBody
    @RequestMapping("/random")
    public List<Attraction> findRandom(){
        return attractionService.findRandom();
    }

    /**
     * 根据名字获取景点
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByName")
    public Attraction findByName(@RequestParam("cn_name") String name){
        System.out.println(name);
        return attractionService.findByName(name);
    }

    /**
     * 获取全部景点
     * @return
     */
    @ResponseBody
    @RequestMapping("/fidAll")
    public List<Attraction> findAll(){
        return attractionService.findAll();
    }

    /**
     * 根据地区获取景点
     * @param area
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByArea")
    public List<Attraction> findByArea(String area){
        return attractionService.findByArea(area);

    }

    /**
     * 根据地区获取景点
     * @param category
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByCategory")
    public List<Attraction> findByCategory(String category){
        return attractionService.findByCategory(category);
    }

    /**
     * 根据分类和名称获取景点
     * @param category
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByCategoryAndArea")
    public List<Attraction> findByCategoryAndName(String category,@RequestParam("cn_name") String name){
        return attractionService.findByCategoryAndName(category,name);
    }

    /**
     * 根据地区和名称获取景点
     * @param area
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByAreaAndName")
    public List<Attraction> findByAreaAndName(String area, @RequestParam("cn_name") String name){
        return attractionService.findByAreaAndName(area,name);
    }

    /**
     * 通过id获取景点
     * @return
     */
    @ResponseBody
    @RequestMapping("/findById")
    public Attraction findById(Integer id){
        return attractionService.findById();
    }


    /**
     * 景点推荐
     */
//    public List<Attraction> pushRecommend(String openid){
//
//    }



}
