package com.tsy.oa.controller;

import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.service.EmpRegularizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EmpRegularization selectOne(Integer id) {
        return this.empRegularizationService.queryById(id);
    }

}
