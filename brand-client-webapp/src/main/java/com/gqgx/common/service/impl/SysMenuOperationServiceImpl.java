package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysMenuOperation;
import com.gqgx.common.mapper.SysMenuOperationMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysMenuOperationService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class SysMenuOperationServiceImpl implements SysMenuOperationService {

    @Autowired
    protected SysMenuOperationMapper sysMenuOperationDAO;


    @Override
    public SysMenuOperation getSysMenuOperation(Long id) {
        return null;
    }

    @Override
    public int saveSysMenuOperation(SysMenuOperation sysMenuOperation) {
        return 0;
    }

    @Override
    public int deleteSysMenuOperation(SysMenuOperation sysMenuOperation) {
        return 0;
    }

    @Override
    public int deleteSysMenuOperationByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysMenuOperation> findSysMenuOperation(Criteria criteria) {
        return null;
    }
}