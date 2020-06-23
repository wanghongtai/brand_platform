package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysOperationLog;
import com.gqgx.common.mapper.SysOperationLogMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class SysOperationLogServiceImpl implements SysOperationLogService {

    @Autowired
    protected SysOperationLogMapper sysOperationLogDAO;


    @Override
    public SysOperationLog getSysOperationLog(Long id) {
        return null;
    }

    @Override
    public int saveSysOperationLog(SysOperationLog sysOperationLog) {
        return 0;
    }

    @Override
    public int deleteSysOperationLog(SysOperationLog sysOperationLog) {
        return 0;
    }

    @Override
    public int deleteSysOperationLogByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysOperationLog> findSysOperationLog(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<SysOperationLog> findOperationLogList(SysOperationLog operationLog, LayuiPage page) {
        return null;
    }
}