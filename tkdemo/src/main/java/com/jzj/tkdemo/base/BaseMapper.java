package com.jzj.tkdemo.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-03 下午10:32
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
