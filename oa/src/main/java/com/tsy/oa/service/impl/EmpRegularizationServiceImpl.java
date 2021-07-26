package com.tsy.oa.service.impl;

import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.dao.EmpRegularizationDao;
import com.tsy.oa.entity.SysUser;
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
@Service
public class EmpRegularizationServiceImpl implements EmpRegularizationService {
    @Resource
    private EmpRegularizationDao empRegularizationDao;
    //查询转正信息
    @Override
    public List<EmpRegularization> selectEmpRegularization() {
        return empRegularizationDao.selectEmpRegularization();
    }



}
