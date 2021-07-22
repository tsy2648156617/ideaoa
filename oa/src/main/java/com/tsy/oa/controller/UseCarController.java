package com.tsy.oa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.Car;
import com.tsy.oa.entity.UseCar;
import com.tsy.oa.service.UseCarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UseCar)表控制层
 *
 * @author makejava
 * @since 2021-07-21 18:34:27
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class UseCarController {
    /**
     * 服务对象
     */
    @Resource
    private UseCarService useCarService;
    //查询已封存车辆
    @GetMapping("/selectUseCar")
    public PageInfo<UseCar> selectUseCar (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<UseCar> entityPage =useCarService.selectUseCar();
        PageInfo<UseCar> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //    新增车辆
    @PostMapping("/inserUseCar")
    public Integer inserUseCar(@RequestBody UseCar useCar){
        return useCarService.inserUseCar(useCar);
    }

    //     高级查询
    @GetMapping("/selectBylikeUseCar")
    public PageInfo<UseCar> selectBylikeUseCar(@RequestParam("currentPage") int currentPage,
                                                               @RequestParam("pagesize") int pagesize,
                                                               @RequestParam(value ="numberModel",required = false) String numberModel
                                                              ){
        List<UseCar> entityPage =useCarService.selectBylikeUseCar(numberModel);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<UseCar> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

}
