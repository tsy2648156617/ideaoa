package com.tsy.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Car)实体类
 *
 * @author makejava
 * @since 2021-07-21 13:35:48
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 292783042318649191L;
    /**
     * 车辆id
     */
    private Integer carid;
    /**
     * 车辆类型
     */
    private String carType;
    /**
     * 费用
     */
    private Integer cost;
    /**
     * 车牌型号
     */
    private String numberModel;
    /**
     * 购买价格
     */
    private Integer carPrice;
    /**
     * 购买日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date buyDate;
    /**
     * 发动机号码
     */
    private Integer engineNumber;
    /**
     * 司机
     */
    private String driver;
    /**
     * 备注
     */
    private String remark;
    /**
     * 封存状态
     */
    private String ccsState;




}
