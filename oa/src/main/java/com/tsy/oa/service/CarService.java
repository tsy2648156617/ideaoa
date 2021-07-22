package com.tsy.oa.service;

import com.tsy.oa.entity.Car;

import java.util.List;

/**
 * (Car)表服务接口
 *
 * @author makejava
 * @since 2021-07-21 15:17:27
 */
public interface CarService {
    //查询未封存车辆
    List<Car> selectYesCar();
    //查询已封存车辆
    List<Car> selectNoCar();
    //新增车辆
    Integer inserCar(Car car);

}
