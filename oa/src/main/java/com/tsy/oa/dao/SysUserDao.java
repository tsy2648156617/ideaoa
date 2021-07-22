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



}

