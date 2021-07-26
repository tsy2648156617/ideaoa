package com.tsy.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysRole)实体类
 *
 * @author makejava
 * @since 2021-07-23 15:02:17
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = -18754181428913645L;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人
     */
    private String founder;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date foundTime;
    /**
     * 修改人
     */
    private String updateName;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    /**
     * 删除状态
     */
    private String timeliness;


}
