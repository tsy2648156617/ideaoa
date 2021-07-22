package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Jop)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:53
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jop implements Serializable {
    private static final long serialVersionUID = 453673602015258161L;
    /**
     * 岗位id
     */
    private Integer jopid;
    /**
     * 岗位名称
     */
    private String jname;


}
