package com.tsy.oa.dao;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpDimission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EmpDimission)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-26 14:17:33
 */
@Mapper
public interface EmpDimissionDao {
    //查询员工离职信息
    List<EmpDimission> selectEmpDimission();

    //新增离职申请
    Integer inserEmpDimission(EmpDimission empDimission);

}

