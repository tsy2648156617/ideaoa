package com.tsy.oa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpDimission;
import com.tsy.oa.service.EmpDimissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EmpDimission)表控制层
 *
 * @author makejava
 * @since 2021-07-26 14:17:36
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class EmpDimissionController {
    /**
     * 服务对象
     */
    @Resource
    private EmpDimissionService empDimissionService;

    //查询调岗
    @GetMapping("/selectEmpDimission")
    public PageInfo<EmpDimission> selectEmpDimission (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<EmpDimission> entityPage =empDimissionService.selectEmpDimission();
        PageInfo<EmpDimission> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }



}
