package com.tsy.oa.service;

import com.tsy.oa.entity.SysUser;

import java.util.List;

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2021-07-22 14:57:12
 */
public interface SysUserService {
    //登录
    SysUser login(String username);

    //查询用户信息
    List<SysUser> selectSysUser();

    /**
     高级查询
     */
    List<SysUser> selectBylikeSysUser(String uCode, String uName, String dname, Integer isdisabled);

    //新增用户
    Integer insertSysUser(SysUser sysUser);
}
