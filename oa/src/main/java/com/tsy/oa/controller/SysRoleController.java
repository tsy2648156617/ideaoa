package com.tsy.oa.controller;

import com.tsy.oa.entity.SysRole;
import com.tsy.oa.entity.SysUser;
import com.tsy.oa.service.SysRoleService;
import com.tsy.oa.vo.AjaxResponse;
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

    //查询角色信息
    @GetMapping("/selectSysRole")
    public List<SysRole> selectSysRole(){
        return sysRoleService.selectSysRole();
    }

    //     高级查询
    @GetMapping("/selectBylikeSysRole")
    public List<SysRole> selectBylikeSysRole(@RequestParam("roleName") String roleName){
        List<SysRole> entityPage =sysRoleService.selectBylikeSysRole(roleName);
        return entityPage;
    }

    //新增角色
    @PostMapping("/insertSysRole")
    public Integer insertSysRole(@RequestBody SysRole sysRole){
        return sysRoleService.insertSysRole(sysRole);
    }

    //删除角色
    @DeleteMapping("/delRoleAnd/{roleId}")
    public AjaxResponse delRole(@PathVariable String roleId){
        System.out.println(roleId);
        sysRoleService.delRole(roleId);
        return AjaxResponse.success();
    }

}
