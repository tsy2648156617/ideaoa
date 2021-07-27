package com.tsy.oa.controller;

import com.tsy.oa.entity.SysUser;
import com.tsy.oa.service.SysUserService;
import com.tsy.oa.vo.AjaxResponse;
import com.tsy.oa.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2021-07-22 14:57:13
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 用户登录
     * */
//    @SysLog("登录")
    @PostMapping("/login")
    public AjaxResponse login(@RequestBody Map map){
        SysUser sysUser =new SysUser();
        sysUser.setUName((String) map.get("uName"));
        sysUser.setUPass((String) map.get("uPass"));
        SysUser loginuser = sysUserService.login(sysUser.getUName());
        if (loginuser == null) {
            return AjaxResponse.success("账户不存在");
        } else {
            if (loginuser.getIsdisabled() != 0) {
                return AjaxResponse.success("账户已停用！请联系超级管理员！");
            } else if (!sysUser.getUPass().equals(loginuser.getUPass())) {
                return AjaxResponse.success("密码错误");
            } else {
                //获取父菜单
                UserVo userVo = new UserVo();
                userVo.setUser(loginuser);
                userVo.setValidate(true);
                return AjaxResponse.success(userVo);
            }
        }

    }

    //查询用户信息
    @GetMapping("/selectSysUser")
    public List<SysUser> selectSysUser(){
        return sysUserService.selectSysUser();
    }

    //     高级查询
    @GetMapping("/selectBylikeSysUser")
    public List<SysUser> selectBylikeSysUser(@RequestParam(value ="uCode",required = false) String uCode,
                                                    @RequestParam(value ="uName",required = false) String uName,
                                                    @RequestParam(value ="dname",required = false) String dname,
                                                    @RequestParam(value ="isdisabled",required = false) Integer isdisabled){
        List<SysUser> entityPage =sysUserService.selectBylikeSysUser(uCode,uName,dname,isdisabled);
        return entityPage;
    }

    //新增用户
    @PostMapping("/insertSysUser")
    public Integer insertSysUser(@RequestBody SysUser sysUser){
        return sysUserService.insertSysUser(sysUser);
    }

    //删除用户
    @DeleteMapping("/delSysUser/{uid}")
    public AjaxResponse delSysUser(@PathVariable String uid){
        System.out.println(uid);
        sysUserService.delSysUser(uid);
        return AjaxResponse.success();
    }


}
