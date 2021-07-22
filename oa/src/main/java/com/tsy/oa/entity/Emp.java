package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:52
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = -54959209311272232L;
    /**
     * 员工id
     */
    private Integer empid;
    /**
     * 员工姓名
     */
    private String ename;
    /**
     * 所属部门
     */
    private String belongDept;
    /**
     * 员工性别
     */
    private String sex;
    /**
     * 员工身份证
     */
    private Integer card;
    /**
     * 员工电话
     */
    private Integer phone;

}
