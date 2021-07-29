package com.tsy.oa.dao;

import com.tsy.oa.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Dept)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-28 15:23:04
 */
@Mapper
public interface DeptDao {
    //查询部门
    List<Dept> selectDept();

}

