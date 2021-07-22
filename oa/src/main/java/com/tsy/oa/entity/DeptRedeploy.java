package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (DeptRedeploy)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:51
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptRedeploy implements Serializable {
    private static final long serialVersionUID = 933858026214173794L;
    /**
     * 调岗id
     */
    private Integer redeployid;
    /**
     * 调岗流程ID
     */
    private String redeployFlowid;
    /**
     * 申请人
     */
    private String applicant;
    /**
     * 原部门
     */
    private String oldDept;
    /**
     * 原岗位
     */
    private String oldJop;
    /**
     * 新部门
     */
    private String newDept;
    /**
     * 新岗位
     */
    private String newJop;
    /**
     * 流程状态
     */
    private Integer flowState;


}
