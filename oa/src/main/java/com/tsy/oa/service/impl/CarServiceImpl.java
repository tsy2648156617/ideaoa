package com.tsy.oa.service.impl;

import com.tsy.oa.dao.CarDao;
import com.tsy.oa.entity.Car;
import com.tsy.oa.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @作者 唐圣禹
 * @创建时间 2021-07-21 15:56
 * @版本 2020.1.3
 */
@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarDao carDao;
    @Override
    public List<Car> selectYesCar() {
        return carDao.selectYesCar();
    }

    @Override
    public List<Car> selectNoCar() {
        return carDao.selectNoCar();
    }

    @Override
    public Integer inserCar(Car car) {
        return carDao.inserCar(car);
    }
}
