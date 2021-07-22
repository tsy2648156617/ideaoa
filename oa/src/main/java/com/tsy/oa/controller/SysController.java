package com.tsy.oa.controller;

import com.tsy.oa.service.SysLogService;
import com.tsy.oa.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 唐圣禹
 * @创建时间 2021-07-22 18:32
 * @版本 2020.1.3
 * @Description 打印所有操作日志
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class SysController {
    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/getAllLog")
    public AjaxResponse getAllLog(int page, int size){
        return AjaxResponse.success(sysLogService.findAllLog(page,size));
    }
}
