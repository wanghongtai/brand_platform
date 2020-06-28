package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysMenu;
import com.gqgx.common.entity.SysMenuTreeVO;
import com.gqgx.common.entity.vo.NodeTreeVo;
import com.gqgx.common.entity.vo.SortableVo;
import com.gqgx.common.mapper.SysMenuMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class SysMenuServiceImpl implements SysMenuService {

    @Override
    public SysMenu getSysMenu(Long id) {
        return null;
    }

    @Override
    public int saveSysMenu(SysMenu sysMenu) {
        return 0;
    }

    @Override
    public int deleteSysMenu(SysMenu sysMenu) {
        return 0;
    }

    @Override
    public int deleteSysMenuByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysMenu> findSysMenu(Criteria criteria) {
        return null;
    }

    @Override
    public List<SysMenu> listAllMenus(Long companyId) {
        return null;
    }

    @Override
    public List<NodeTreeVo> findAll(Long companyId) {
        return null;
    }

    @Override
    public int saveOrUpdateMenu(SysMenu sysMenu) {
        return 0;
    }

    @Override
    public int isExsit(SysMenu sysMenu) {
        return 0;
    }

    @Override
    public List<SysMenuTreeVO> listAllMenuAndOperationByUserId(Long userId, Long companyId) {
        return null;
    }

    @Override
    public List<SortableVo> sortableList() {
        return null;
    }

    @Override
    public int maxSort() {
        return 0;
    }

    @Override
    public int reSortable(String ids) {
        return 0;
    }

    @Override
    public List<SysMenu> parList() {
        return null;
    }

    @Override
    public List<SysMenu> menuLPowerist(Long positionId) {
        return null;
    }
}