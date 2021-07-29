package com.tsy.oa.service;

import com.tsy.oa.entity.Car;
import com.tsy.oa.entity.Dept;

import java.util.List;

/**
 * (Dept)表服务接口
 *
 * @author makejava
 * @since 2021-07-28 15:23:05
 */
public interface DeptService {
    //查询部门
    List<Dept> selectDept();


}
