package com.javasm.controller;

import com.javasm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2022/10/25-21:01
 * @Since：jdk1.8
 * @Description：
 */

@RestController
public class HelloContrller{



    @Autowired
    private User user;


    @RequestMapping("/")
    public String hello(@RequestParam("name") String name){
        return "你好啊"+name;
    }



    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id, @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String header,
                                     @RequestHeader Map<String,String> allHead,
                                     @RequestParam("intests") List<String> hobbies){

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",id);
        hashMap.put("username",name);
        hashMap.put("pv",pv);
        hashMap.put("head",header);
        hashMap.put("allHead",allHead);
        hashMap.put("hobbies",hobbies);

        return hashMap;



    }




    @GetMapping("/user")
    public User showUser(){


        return user;
    }
}
