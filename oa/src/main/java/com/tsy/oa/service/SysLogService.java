package com.tsy.oa.service;
import com.github.pagehelper.PageInfo;
import com.tsy.oa.entity.Log;
import com.tsy.oa.vo.SysLogVo;

import java.util.List;

/**
 * @Author tsy
 * @Date 2021/7/11 0:05
 * @Description 系统日志业务层
 * @Since version-1.0
 */
public interface SysLogService {

    int addSysLog(Log log);

    PageInfo<SysLogVo> findAllLog(int page, int size);

}
