package com.tsy.oa.dao;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpRegularization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DeptRedeploy)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-26 11:36:06
 */
@Mapper
public interface DeptRedeployDao {
    //查询调岗信息
    List<DeptRedeploy> selectDeptRedeploy();


}

