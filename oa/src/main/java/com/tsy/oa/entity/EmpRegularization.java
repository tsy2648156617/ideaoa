package com.tsy.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (EmpRegularization)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:53
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpRegularization implements Serializable {
    private static final long serialVersionUID = -29546088852928573L;
    /**
     * 转正id
     */
    private Integer regularizationid;
    /**
     * 标题
     */
    private String title;
    /**
     * 申请人
     */
    private String applicant;
    /**
     * 申请部门
     */
    private String applyDept;
    /**
     * 转正人员
     */
    private String regularizationEmp;
    /**
     * 转正人员部门
     */
    private String regularizationDept;
    /**
     * 入职时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date intodate;
    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date applyDate;
    /**
     * 岗位职责的理解
     */
    private String jopUnderstand;
    /**
     * 试用期成长
     */
    private String growup;
    /**
     * 目前不足
     */
    private String deficiency;
    /**
     * 转正状态
     */
    private Integer regularizationState;
    /**
     * 转正流程ID
     */
    private String regularizationFlowid;


}
