package com.jzj.sbdemo.mapper;

import com.jzj.sbdemo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 下午9:54
 */
public interface UserMapper {
    @Select("select * from test.user where id =#{id}")
    User selectById(@Param("id") Integer id);

    int insert(User user);

    void updateUser(User user);

    User select(Integer id);
}
