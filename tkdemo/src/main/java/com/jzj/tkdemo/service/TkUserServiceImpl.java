package com.jzj.tkdemo.service;

import com.jzj.tkdemo.dao.UserPOMapper;
import com.jzj.tkdemo.domain.po.UserPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-03 下午10:48
 */
@Service
public class TkUserServiceImpl implements ITkUserService {


    @Resource
    private UserPOMapper userPOMapper;

    @Override
    public UserPO selectById(Integer id) {

        UserPO userPO = userPOMapper.selectByPrimaryKey(id);
        return userPO;
    }

    @Override
    public int insertUser(UserPO userPO) {
        int count = userPOMapper.insert(userPO);
        return count;
    }

    @Override
    public int updateUser(UserPO userPO) {
       int count = userPOMapper.updateByPrimaryKey(userPO);
       return count;
    }
}
