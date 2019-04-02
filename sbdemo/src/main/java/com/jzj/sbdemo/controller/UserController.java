package com.jzj.sbdemo.controller;

import com.jzj.sbdemo.domain.User;
import com.jzj.sbdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 下午9:47
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("selectUser/{id}")
    private String getUser(@PathVariable String id){
        User user = userService.select(Integer.parseInt(id));
        return user.toString();
    }

    @RequestMapping("getUser/{id}")
    private String selectUser(@PathVariable String id){
        User user = userService.selectById(Integer.parseInt(id));
        return user.toString();
    }

    @RequestMapping("addUser")
    private int  addUser(){User user = new User();
        user.setUserName("aaa");
        user.setPassword("pwd");
        user.setSafe(true);
       int count =  userService.insert(user);
       return count;
    }

    @RequestMapping("updateUser/{name}")
    private void  update(@PathVariable String name){
        User user = new User();
        user.setUserName(name);
        user.setPassword("pwd");
        user.setSafe(true);
        user.setId(1);
        userService.updateUser(user);
    }
}
