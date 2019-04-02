package com.jzj.sbdemo.service;

import com.jzj.sbdemo.domain.User;
import com.jzj.sbdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 下午9:49
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void updateUser(User user) {
         userMapper.updateUser(user);
    }

    @Override
    public int insert(User user) {
        int count = userMapper.insert(user);
        return count;
    }

    @Override
    public User select(Integer id) {
        User user = userMapper.select(id);
        return user;
    }
}
