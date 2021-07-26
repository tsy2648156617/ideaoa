package com.tsy.oa.service.impl;

import com.tsy.oa.entity.DeptRedeploy;
import com.tsy.oa.dao.DeptRedeployDao;
import com.tsy.oa.entity.EmpRegularization;
import com.tsy.oa.service.DeptRedeployService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DeptRedeploy)表服务实现类
 *
 * @author makejava
 * @since 2021-07-26 11:36:09
 */
@Service("deptRedeployService")
public class DeptRedeployServiceImpl implements DeptRedeployService {
    @Resource
    private DeptRedeployDao deptRedeployDao;

    //查询调岗信息
    @Override
    public List<DeptRedeploy> selectDeptRedeploy() {
        return deptRedeployDao.selectDeptRedeploy();
    }

    //新增调岗信息
    @Override
    public Integer inserDeptRedeploy(DeptRedeploy deptRedeploy) {
        return deptRedeployDao.inserDeptRedeploy(deptRedeploy);
    }


}
