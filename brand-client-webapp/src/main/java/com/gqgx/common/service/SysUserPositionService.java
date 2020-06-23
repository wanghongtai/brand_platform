package com.gqgx.common.service;

import java.util.List;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysUserPosition;
import com.gqgx.common.paging.PagingResult;


public interface SysUserPositionService {

    SysUserPosition getSysUserPosition(Long id);

    int saveSysUserPosition(SysUserPosition sysUserPosition);

    int deleteSysUserPosition(SysUserPosition sysUserPosition);

    int deleteSysUserPositionByIds(Long[] ids);

    PagingResult<SysUserPosition> findSysUserPosition(Criteria criteria);
    
    public int updateUserPosition(SysUserPosition sysUserPosition);
    
    public int delPositionByUserids(Long[] userIds);
    
    public int deleteUserPosition(Long positionId, Long[] userId);
    
    public List<SysUserPosition> findByUserId(Long userId);
}