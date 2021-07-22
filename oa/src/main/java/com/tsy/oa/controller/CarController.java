package com.tsy.oa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.Car;
import com.tsy.oa.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Car)表控制层
 *
 * @author makejava
 * @since 2021-07-21 15:17:31
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class CarController {
    /**
     * 服务对象
     */
    @Resource
    private CarService carService;

    //查询未封存车辆
    @GetMapping("/selectYesCar")
    public PageInfo<Car> selectYesCar (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Car> entityPage =carService.selectYesCar();
        PageInfo<Car> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //查询已封存车辆
    @GetMapping("/selectNoCar")
    public PageInfo<Car>selectNoCar (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Car> entityPage =carService.selectNoCar();
        PageInfo<Car> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //    新增车辆
    @PostMapping("/inserCar")
    public Integer inserCar(@RequestBody Car car){
        return carService.inserCar(car);
    }
}
