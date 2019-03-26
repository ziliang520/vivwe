package com.vivwe.mapper;

import com.core.mapper.TkMapper;
import com.vivwe.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends TkMapper<User> {

    public User selectByCardNo(@Param("userId") Integer userId);
}
