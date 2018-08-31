package com.app.application.mapper;

import com.app.application.config.BaseMapper;
import com.app.application.model.Car;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper extends BaseMapper<Car> {
}
