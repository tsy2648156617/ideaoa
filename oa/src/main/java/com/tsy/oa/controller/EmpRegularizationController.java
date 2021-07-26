package com.tsy.oa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.entity.UseCar;
import com.tsy.oa.service.EmpRegularizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EmpRegularization)表控制层
 *
 * @author makejava
 * @since 2021-07-22 11:21:46
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class EmpRegularizationController {
    /**
     * 服务对象
     */
    @Resource
    private EmpRegularizationService empRegularizationService;
    //查询转正
    @GetMapping("/selectEmpRegularization")
    public PageInfo<EmpRegularization> selectEmpRegularization (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<EmpRegularization> entityPage =empRegularizationService.selectEmpRegularization();
        PageInfo<EmpRegularization> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

}
