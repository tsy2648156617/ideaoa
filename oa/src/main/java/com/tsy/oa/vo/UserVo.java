package com.tsy.oa.vo;

import com.tsy.oa.entity.SysUser;
import lombok.Data;



@Data
public class UserVo {
    private boolean isValidate;
    private SysUser user;
}