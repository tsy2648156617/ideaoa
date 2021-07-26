package com.tsy.oa.controller;

import com.tsy.oa.entity.SysRole;
import com.tsy.oa.entity.SysUser;
import com.tsy.oa.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRole)表控制层
 *
 * @author makejava
 * @since 2021-07-23 16:56:00
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    //查询用户信息
    @GetMapping("/selectSysRole")
    public List<SysRole> selectSysRole(){
        return sysRoleService.selectSysRole();
    }

    //     高级查询
    @GetMapping("/selectBylikeSysRole")
    public List<SysRole> selectBylikeSysRole(@RequestParam(value ="roleName",required = false) String roleName){
        List<SysRole> entityPage =sysRoleService.selectBylikeSysRole(roleName);
        return entityPage;
    }

    //新增用户
    @PostMapping("/insertSysRole")
    public Integer insertSysRole(@RequestBody SysRole sysRole){
        return sysRoleService.insertSysRole(sysRole);
    }


}
