package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2021-07-22 14:57:11
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 605668132992517260L;
    //用户id
    private Integer uid;
    //用户编号
    private String uCode;
    //用户名称
    private String uName;
    //用户密码
    private String uPass;
    //所属部门
    private Dept dept;
    private Integer deptid;
    //是否禁用
    private Integer isdisabled;



}
