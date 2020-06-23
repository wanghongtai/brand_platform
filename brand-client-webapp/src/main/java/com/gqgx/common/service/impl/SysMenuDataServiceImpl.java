package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysMenuData;
import com.gqgx.common.mapper.SysMenuDataMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysMenuDataService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class SysMenuDataServiceImpl implements SysMenuDataService {

    @Autowired
    protected SysMenuDataMapper sysMenuDataDAO;


    @Override
    public SysMenuData getSysMenuData(Long id) {
        return null;
    }

    @Override
    public int saveSysMenuData(SysMenuData sysMenuData) {
        return 0;
    }

    @Override
    public int deleteSysMenuData(SysMenuData sysMenuData) {
        return 0;
    }

    @Override
    public int deleteSysMenuDataByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysMenuData> findSysMenuData(Criteria criteria) {
        return null;
    }
}