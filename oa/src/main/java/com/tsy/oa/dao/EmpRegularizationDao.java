package com.tsy.oa.dao;

import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.entity.SysUser;
import com.tsy.oa.entity.UseCar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EmpRegularization)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-22 11:21:41
 */
@Mapper
public interface EmpRegularizationDao {
    //查询转正信息
    List<EmpRegularization> selectEmpRegularization();

    //新增转正申请
    Integer inserEmpRegularization(EmpRegularization empRegularization);

}

