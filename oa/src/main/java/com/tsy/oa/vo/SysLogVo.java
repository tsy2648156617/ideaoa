package com.tsy.oa.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tsy.oa.entity.SysUser;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author tsy
 * @Date 2021/7/10 23:54
 * @Description 系统日志封装返回类
 * @Since version-1.0
 */
@Data
public class SysLogVo {
    /**
     * 日志ID
     * */
    private String logId;
    /**
     * 创建时间
     * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    /**
     * 用户
     * */
    private SysUser user;
    /**
     * 操作
     * */
    private String operation;
    /**
     * ip地址
     * */
    private String ipaddress;
    /**
     * 变更信息
     * */
    private String changeInfo;
    /**
     * 操作结果
     * */
    private String operationResult;
}
