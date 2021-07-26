package com.tsy.oa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.service.DeptRedeployService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DeptRedeploy)表控制层
 *
 * @author makejava
 * @since 2021-07-26 11:36:10
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class DeptRedeployController {
    /**
     * 服务对象
     */
    @Resource
    private DeptRedeployService deptRedeployService;
    //查询调岗
    @GetMapping("/selectDeptRedeploy")
    public PageInfo<DeptRedeploy> selectDeptRedeploy (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<DeptRedeploy> entityPage =deptRedeployService.selectDeptRedeploy();
        PageInfo<DeptRedeploy> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }



}
