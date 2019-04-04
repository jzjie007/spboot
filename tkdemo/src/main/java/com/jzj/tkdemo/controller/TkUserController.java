package com.jzj.tkdemo.controller;

import com.jzj.tkdemo.domain.po.UserPO;
import com.jzj.tkdemo.service.ITkUserService;
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
public class TkUserController {

    @Autowired
    private ITkUserService tkUserService;

    @RequestMapping("selectUser/{id}")
    private String getUser(@PathVariable String id) {
        UserPO user = tkUserService.selectById(Integer.parseInt(id));
        return user.toString();
    }


    @RequestMapping("addUser")
    private int addUser() {
        UserPO user = new UserPO();
        user.setUserName("aaa");
        user.setPassword("pwd");
        user.setSafe(true);
        int count = tkUserService.insertUser(user);
        return count;
    }

    @RequestMapping("updateUser/{name}")
    private void update(@PathVariable String name) {
        UserPO user = new UserPO();
        user.setUserName(name);
        user.setPassword("pwd");
        user.setSafe(true);
        user.setId(1);
        tkUserService.updateUser(user);
    }
}
