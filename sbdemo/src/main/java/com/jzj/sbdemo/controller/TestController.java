package com.jzj.sbdemo.controller;

import com.jzj.sbdemo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 上午7:54
 */
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "hello 贾子杰";
    }


    @RequestMapping("user")
    public User user(){
        User u = new User();
        u.setPassword("pwd");
        u.setId(1);
        u.setUserName("jzj");
        return  u;
    }

    @RequestMapping("list")
    public List<User> listUser(){
        List<User> users = new ArrayList<>();
        User u = new User();
        u.setPassword("pwd");
        u.setId(1);
        u.setUserName("jzj");

        User u1 = new User();
        u1.setPassword("pwd");
        u1.setId(1);
        u1.setUserName("jzj");

        users.add(u);
        users.add(u1);
        return users;
    }


    @RequestMapping("map")
    public Map<String, Object> mapUser(){
        Map<String, Object> maps = new HashMap<>();
        maps.put("1", "zhangsan");
        maps.put("2", "李四");
        return maps;
    }
}
