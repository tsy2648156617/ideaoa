package com.tsy.oa.service.impl;

import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.dao.EmpRegularizationDao;
import com.tsy.oa.service.EmpRegularizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EmpRegularization)表服务实现类
 *
 * @author makejava
 * @since 2021-07-22 11:21:45
 */
@Service("empRegularizationService")
public class EmpRegularizationServiceImpl implements EmpRegularizationService {
    @Resource
    private EmpRegularizationDao empRegularizationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param regularizationid 主键
     * @return 实例对象
     */
    @Override
    public EmpRegularization queryById(Integer regularizationid) {
        return this.empRegularizationDao.queryById(regularizationid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EmpRegularization> queryAllByLimit(int offset, int limit) {
        return this.empRegularizationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param empRegularization 实例对象
     * @return 实例对象
     */
    @Override
    public EmpRegularization insert(EmpRegularization empRegularization) {
        this.empRegularizationDao.insert(empRegularization);
        return empRegularization;
    }

    /**
     * 修改数据
     *
     * @param empRegularization 实例对象
     * @return 实例对象
     */
    @Override
    public EmpRegularization update(EmpRegularization empRegularization) {
        this.empRegularizationDao.update(empRegularization);
        return this.queryById(empRegularization.getRegularizationid());
    }

    /**
     * 通过主键删除数据
     *
     * @param regularizationid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer regularizationid) {
        return this.empRegularizationDao.deleteById(regularizationid) > 0;
    }
}
