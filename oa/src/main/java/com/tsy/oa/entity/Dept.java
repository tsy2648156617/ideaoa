package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:51
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = 737760434579500951L;
    /**
     * 部门id
     */
    private Integer deptid;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 岗位id
     */
    private Integer jopid;

}
