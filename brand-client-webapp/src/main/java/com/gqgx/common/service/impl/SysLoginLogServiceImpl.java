package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysLoginLog;
import com.gqgx.common.mapper.SysLoginLogMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysLoginLogService;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class SysLoginLogServiceImpl implements SysLoginLogService {

    @Autowired
    protected SysLoginLogMapper sysLoginLogDAO;


    @Override
    public SysLoginLog getSysLoginLog(Long id) {
        return null;
    }

    @Override
    public int saveSysLoginLog(SysLoginLog sysLoginLog) {
        return 0;
    }

    @Override
    public int deleteSysLoginLog(SysLoginLog sysLoginLog) {
        return 0;
    }

    @Override
    public int deleteSysLoginLogByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysLoginLog> findSysLoginLog(Criteria criteria) {
        return null;
    }
}