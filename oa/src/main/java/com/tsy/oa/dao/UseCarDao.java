package com.tsy.oa.dao;

import com.tsy.oa.entity.Car;
import com.tsy.oa.entity.UseCar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UseCar)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-21 18:34:24
 */
@Mapper
public interface UseCarDao {
    //查询车辆申请
    List<UseCar> selectUseCar();
    //新增车辆使用申请
    Integer inserUseCar(UseCar useCar);

    /**
     搞鸡查询
     */
    List<UseCar> selectBylikeUseCar(@Param("numberModel") String numberModel);

}

