package com.tsy.oa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (SysMenu)实体类
 *
 * @author makejava
 * @since 2021-07-23 15:02:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysMenu implements Serializable {
    private static final long serialVersionUID = 336517354390445831L;
    /**
     * 菜单id
     */
    private Integer menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 父菜单id
     */
    private Integer parentId;
    /**
     * 组件排序
     */
    private Integer orderNum;
    /**
     * 菜单类型
     */
    private String menuType;
    /**
     * 路由地址
     */
    private String path;
    /**
     * 路由名称
     */
    private String name;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 权限标识
     */
    private String perms;
    /**
     * 菜单状态
     */
    private String visible;
    /**
     * 组件路径
     */
    private String component;




}
