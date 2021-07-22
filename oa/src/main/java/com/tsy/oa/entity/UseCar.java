package com.tsy.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (UseCar)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:54
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UseCar implements Serializable {
    private static final long serialVersionUID = 638398041717593193L;
    /**
     * 用车申请id
     */
    private Integer useid;
    /**
     * 标题
     */
    private String title;
    /**
     * 申请人
     */
    private String applicant;
    /**
     * 用车人
     */
    private String usecarEmp;
    /**
     * 用车部门
     */
    private String usecarDept;
    /**
     * 车辆
     */
    private Car car;
    private String vehicle;
    /**
     * 司机
     */
    private String driver;
    /**
     * 开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date stardate;
    /**
     * 结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enddate;
    /**
     * 事由
     */
    private String reasons;
    /**
     * 审批状态
     */
    private String approvalState;
    /**
     * 紧急程度
     */
    private Integer emerg;


}
