package com.tsy.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (EmpDimission)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:52
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpDimission implements Serializable {
    private static final long serialVersionUID = 401989152952299829L;
    /**
     * 离职ID
     */
    private Integer dimissionid;
    /**
     * 离职流程ID
     */
    private String dimissionFlowid;
    /**
     * 申请人
     */
    private String applicant;
    /**
     * 申请人部门
     */
    private String applyDept;
    /**
     * 现任岗位
     */
    private String nowJop;
    /**
     * 提交日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date submitDate;
    /**
     * 离职原因
     */
    private String dimissionReason;
    /**
     * 流程状态
     */
    private Integer flowState;


}
