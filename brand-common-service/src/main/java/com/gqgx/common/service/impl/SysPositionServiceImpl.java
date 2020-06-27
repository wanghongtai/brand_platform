package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysPosition;
import com.gqgx.common.mapper.SysPositionMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.Page;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysPositionPermissionsService;
import com.gqgx.common.service.SysPositionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class SysPositionServiceImpl implements SysPositionService {

    @Autowired
    protected SysPositionMapper sysPositionDAO;
    
    @Autowired
    protected SysPositionPermissionsService sysPositionPermissionsService;

    @Override
    public SysPosition getSysPosition(Long id) {
        return null;
    }

    @Override
    public int saveSysPosition(SysPosition sysPosition) {
        return 0;
    }

    @Override
    public int deleteSysPosition(SysPosition sysPosition) {
        return 0;
    }

    @Override
    public int deleteSysPositionByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysPosition> findSysPosition(Criteria criteria) {
        return null;
    }

    @Override
    public boolean isExsitPosition(SysPosition sysPosition) {
        return false;
    }

    @Override
    public PagingResult<SysPosition> findPositionByPage(SysPosition sysPosition, Page page) {
        return null;
    }

    @Override
    public List<SysPosition> listAll(Long companyId) {
        return null;
    }

    @Override
    public List<SysPosition> findBySysPosition(SysPosition sysPosition) {
        return null;
    }

    @Override
    public SysPosition findPositionById(Long positionId, Long companyId) {
        return null;
    }

    @Override
    public PagingResult<SysPosition> positionList(SysPosition sysPosition, LayuiPage page) {
        return null;
    }
}