package com.tsy.oa.dao;

import com.tsy.oa.entity.SysRole;
import com.tsy.oa.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysRole)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-23 16:55:57
 */
@Mapper
public interface SysRoleDao {
    //查询角色信息
    List<SysRole> selectSysRole();

    /**
     搞鸡查询
     */
    List<SysRole> selectBylikeSysRole(@Param("roleName") String roleName);

    //新增角色
    Integer insertSysRole(SysRole sysRole);

}

