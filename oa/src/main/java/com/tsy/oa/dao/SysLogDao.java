package com.tsy.oa.dao;

import com.tsy.oa.entity.Log;
import com.tsy.oa.vo.SysLogVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author tsy
 * @Date 2021/7/10 23:35
 * @Description 系统日志数据访问层
 * @Since version-1.0
 */
@Repository
@Mapper
public interface SysLogDao {

    int addSysLog(Log log);

    List<SysLogVo> findAllLog();
}
