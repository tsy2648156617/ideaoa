package com.tsy.oa.dao;

import com.tsy.oa.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Car)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-21 15:17:25
 */
@Mapper
public interface CarDao {
    //查询未封存车辆
    List<Car> selectYesCar();
    //查询已封存车辆
    List<Car> selectNoCar();
    //新增车辆
    Integer inserCar(Car car);

}

