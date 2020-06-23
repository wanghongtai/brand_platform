package com.gqgx.common.service;

import java.util.List;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysMenu;
import com.gqgx.common.paging.PagingResult;


public interface SysMenuService {

    SysMenu getSysMenu(Long id);

    int saveSysMenu(SysMenu sysMenu);

    int deleteSysMenu(SysMenu sysMenu);

    int deleteSysMenuByIds(Long[] ids);

    PagingResult<SysMenu> findSysMenu(Criteria criteria);
    
    public List<SysMenu> listAllMenus(Long companyId);
    

    public int saveOrUpdateMenu(SysMenu sysMenu);
    
    public int isExsit(SysMenu sysMenu);
    

	int maxSort();

	int reSortable(String ids);

	List<SysMenu> parList();

	List<SysMenu> menuLPowerist(Long positionId);
}