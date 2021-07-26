package com.tsy.oa.service.impl;

import com.tsy.oa.dao.SysUserDao;
import com.tsy.oa.entity.SysUser;
import com.tsy.oa.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2021-07-22 14:57:13
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    /**
     * 用户登录
     * */
    @Override
    public SysUser login(String username) {
        return sysUserDao.selectUserByName(username);
    }

     //查询用户信息
     @Override
     public List<SysUser> selectSysUser() {
            return sysUserDao.selectSysUser();
        }

        /**
         高级查询
         */
        @Override
        public List<SysUser> selectBylikeSysUser(String uCode, String uName, String dname, Integer isdisabled) {
            return sysUserDao.selectBylikeSysUser(uCode,uName,dname,isdisabled);
        }

        //新增用户
        @Override
        public Integer insertSysUser(SysUser sysUser) {
            return sysUserDao.insertSysUser(sysUser);
        }



}
