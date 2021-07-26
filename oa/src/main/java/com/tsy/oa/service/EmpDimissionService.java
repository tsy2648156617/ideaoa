package com.tsy.oa.service;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpDimission;

import java.util.List;

/**
 * (EmpDimission)表服务接口
 *
 * @author makejava
 * @since 2021-07-26 14:17:34
 */
public interface EmpDimissionService {
    //查询员工离职信息
    List<EmpDimission> selectEmpDimission();

    //新增离职信息
    Integer inserEmpDimission(EmpDimission empDimission);

}
