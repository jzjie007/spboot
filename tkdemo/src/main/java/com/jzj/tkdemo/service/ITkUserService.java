package com.jzj.tkdemo.service;

import com.jzj.tkdemo.domain.po.UserPO;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-03 下午10:47
 */
public interface ITkUserService {

    UserPO  selectById(Integer id);

    int insertUser(UserPO userPO);

    int updateUser(UserPO userPO);
}
