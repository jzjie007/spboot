package com.jzj.sbdemo.service;

import com.jzj.sbdemo.domain.User;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 下午9:49
 */
public interface IUserService {

    User selectById(Integer id);

    void updateUser(User user);

    int insert(User user);

    User select(Integer id);
}
