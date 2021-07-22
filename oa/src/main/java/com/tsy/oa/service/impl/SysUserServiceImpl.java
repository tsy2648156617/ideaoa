package com.tsy.oa.service.impl;

import com.tsy.oa.entity.SysUser;
import com.tsy.oa.dao.SysUserDao;
import com.tsy.oa.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


}
