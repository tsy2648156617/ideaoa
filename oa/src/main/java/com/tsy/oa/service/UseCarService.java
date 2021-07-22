package com.tsy.oa.service;

import com.tsy.oa.entity.Car;
import com.tsy.oa.entity.UseCar;

import java.util.List;

/**
 * (UseCar)表服务接口
 *
 * @author makejava
 * @since 2021-07-21 18:34:26
 */
public interface UseCarService {

    //查询已封存车辆
    List<UseCar> selectUseCar();
    //新增车辆
    Integer inserUseCar(UseCar useCar);

    /**
     高级查询
     */
    List<UseCar> selectBylikeUseCar(String numberModel);

}
