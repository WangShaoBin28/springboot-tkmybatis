package com.app.application.mapper;

import com.app.application.config.BaseMapper;
import com.app.application.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
