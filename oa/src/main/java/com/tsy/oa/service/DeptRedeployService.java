package com.tsy.oa.service;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpRegularization;

import java.util.List;

/**
 * (DeptRedeploy)表服务接口
 *
 * @author makejava
 * @since 2021-07-26 11:36:08
 */
public interface DeptRedeployService {
    //查询调岗信息
    List<DeptRedeploy> selectDeptRedeploy();

    //新增调岗信息
    Integer inserDeptRedeploy(DeptRedeploy deptRedeploy);

}
