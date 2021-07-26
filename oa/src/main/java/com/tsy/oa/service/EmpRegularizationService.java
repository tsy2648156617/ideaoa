package com.tsy.oa.service;

import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.entity.SysUser;

import java.util.List;

/**
 * (EmpRegularization)表服务接口
 *
 * @author makejava
 * @since 2021-07-22 11:21:44
 */
public interface EmpRegularizationService {
    //查询转正信息
    List<EmpRegularization> selectEmpRegularization();

}
