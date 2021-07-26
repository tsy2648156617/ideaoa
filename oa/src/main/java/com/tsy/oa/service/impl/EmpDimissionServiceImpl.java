package com.tsy.oa.service.impl;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.entity.EmpDimission;
import com.tsy.oa.dao.EmpDimissionDao;
import com.tsy.oa.service.EmpDimissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EmpDimission)表服务实现类
 *
 * @author makejava
 * @since 2021-07-26 14:17:36
 */
@Service("empDimissionService")
public class EmpDimissionServiceImpl implements EmpDimissionService {
    @Resource
    private EmpDimissionDao empDimissionDao;

    //查询调岗信息
    @Override
    public List<EmpDimission> selectEmpDimission() {
        return empDimissionDao.selectEmpDimission();
    }

}
