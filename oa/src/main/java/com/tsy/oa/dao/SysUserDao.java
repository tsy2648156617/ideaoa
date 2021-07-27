package com.tsy.oa.dao;

import com.tsy.oa.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-22 14:57:12
 */
@Repository
@Mapper
public interface SysUserDao {


    String queryUserIdByUserName(String username);

    SysUser selectUserByName(@Param("username") String username);

    //查询用户信息
    List<SysUser> selectSysUser();

    /**
     搞鸡查询
     */
    List<SysUser> selectBylikeSysUser(@Param("uCode") String uCode, @Param("uName") String uName, @Param("dname") String dname, @Param("isdisabled") Integer isdisabled);

    //新增用户
    Integer insertSysUser(SysUser sysUser);
    //删除角色
    void delSysUser(String  uid);
}

