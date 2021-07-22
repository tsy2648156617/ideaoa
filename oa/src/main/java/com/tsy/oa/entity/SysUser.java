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

    private Integer uid;

    private String uCode;

    private String uName;

    private String uPass;

    private Integer uDept;

    private Integer isdisabled;



}
