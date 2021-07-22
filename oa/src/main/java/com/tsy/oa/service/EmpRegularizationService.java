package com.tsy.oa.service;

import com.tsy.oa.entity.EmpRegularization;

import java.util.List;

/**
 * (EmpRegularization)表服务接口
 *
 * @author makejava
 * @since 2021-07-22 11:21:44
 */
public interface EmpRegularizationService {

    /**
     * 通过ID查询单条数据
     *
     * @param regularizationid 主键
     * @return 实例对象
     */
    EmpRegularization queryById(Integer regularizationid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EmpRegularization> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param empRegularization 实例对象
     * @return 实例对象
     */
    EmpRegularization insert(EmpRegularization empRegularization);

    /**
     * 修改数据
     *
     * @param empRegularization 实例对象
     * @return 实例对象
     */
    EmpRegularization update(EmpRegularization empRegularization);

    /**
     * 通过主键删除数据
     *
     * @param regularizationid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer regularizationid);

}
