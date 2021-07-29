package com.tsy.oa.service.impl;

import com.tsy.oa.entity.Dept;
import com.tsy.oa.dao.DeptDao;
import com.tsy.oa.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2021-07-28 15:23:06
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public List<Dept> selectDept() {
        return deptDao.selectDept();
    }

}
