package com.tsy.oa.controller;

import com.tsy.oa.entity.Dept;
import com.tsy.oa.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表控制层
 *
 * @author makejava
 * @since 2021-07-28 15:23:06
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;

    //查询部门
    @GetMapping("/selectDept")
    public List<Dept> selectDept (){
        List<Dept> entityPage =deptService.selectDept();
        return entityPage;
    }


}
