package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysPositionMenu;
import com.gqgx.common.entity.SysPositionOperation;
import com.gqgx.common.mapper.SysPositionMenuMapper;
import com.gqgx.common.mapper.SysPositionOperationMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysPositionMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class SysPositionMenuServiceImpl implements SysPositionMenuService {

    @Autowired
    protected SysPositionMenuMapper sysPositionMenuDAO;
    
    @Autowired
    protected SysPositionOperationMapper sysPositionOperationDAO;


    @Override
    public SysPositionMenu getSysPositionMenu(Long id) {
        return null;
    }

    @Override
    public int saveSysPositionMenu(SysPositionMenu sysPositionMenu) {
        return 0;
    }

    @Override
    public int deleteSysPositionMenu(SysPositionMenu sysPositionMenu) {
        return 0;
    }

    @Override
    public int deletePositionMenuByIds(Long menuId, Long[] positionIds) {
        return 0;
    }

    @Override
    public int deleteSysPositionMenuByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysPositionMenu> findSysPositionMenu(Criteria criteria) {
        return null;
    }

    @Override
    public int savePostionPermisstion(Long postionId, List<SysPositionMenu> menus, List<SysPositionOperation> operations) {
        return 0;
    }
}