package com.tsy.oa.service;

import com.tsy.oa.entity.SysRole;
import com.tsy.oa.entity.SysUser;

import java.util.List;

/**
 * (SysRole)表服务接口
 *
 * @author makejava
 * @since 2021-07-23 16:55:59
 */
public interface SysRoleService {
    //查询角色信息
    List<SysRole> selectSysRole();

    /**
     高级查询
     */
    List<SysRole> selectBylikeSysRole(String roleName);

    //新增角色
    Integer insertSysRole(SysRole sysRole);
}
