package com.tsy.oa.service.impl;

import com.tsy.oa.entity.SysRole;
import com.tsy.oa.dao.SysRoleDao;
import com.tsy.oa.entity.SysUser;
import com.tsy.oa.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRole)表服务实现类
 *
 * @author makejava
 * @since 2021-07-23 16:56:00
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;

    //查询用户信息
    @Override
    public List<SysRole> selectSysRole() {
        return sysRoleDao.selectSysRole();
    }

    /**
     高级查询
     */
    @Override
    public List<SysRole> selectBylikeSysRole(String roleName) {
        return sysRoleDao.selectBylikeSysRole(roleName);
    }

    //新增用户
    @Override
    public Integer insertSysRole(SysRole sysRole) {
        return sysRoleDao.insertSysRole(sysRole);
    }

    //删除用户
    @Override
    public void delRole(String roleId) {
        sysRoleDao.delRole(roleId);
    }

}
