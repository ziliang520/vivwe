package com.core.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CrudMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
