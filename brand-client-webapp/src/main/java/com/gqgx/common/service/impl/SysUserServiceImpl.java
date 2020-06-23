package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysMenuOperation;
import com.gqgx.common.entity.SysUser;
import com.gqgx.common.mapper.SysUserMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.Page;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysPositionService;
import com.gqgx.common.service.SysUserPositionService;
import com.gqgx.common.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    protected SysUserMapper sysUserDAO;
    
    @Autowired
    protected SysUserPositionService sysUserPositionService;
    @Autowired
    protected SysPositionService positionService;


    @Override
    public SysUser getSysUser(Long id) {
        return null;
    }

    @Override
    public int saveSysUser(SysUser sysUser) {
        return 0;
    }

    @Override
    public int deleteSysUser(SysUser sysUser) {
        return 0;
    }

    @Override
    public int deleteSysUserByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysUser> findSysUser(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<SysUser> findSysUserByPage(SysUser sysUser, Page page) {
        return null;
    }

    @Override
    public int addOrUpdateSysUser(SysUser sysUser) {
        return 0;
    }

    @Override
    public boolean isExsitUser(SysUser sysUser) {
        return false;
    }

    @Override
    public boolean isExsitAccountName(SysUser sysUser) {
        return false;
    }

    @Override
    public SysUser findSysUserById(Long userId, Long companyId) {
        return null;
    }

    @Override
    public PagingResult<SysUser> querySysUserPage(SysUser sysuser, Page page) {
        return null;
    }

    @Override
    public SysUser findUserByAccountName(String accountName) {
        return null;
    }

    @Override
    public SysUser findBaseUserByAccountName(String accountName) {
        return null;
    }

    @Override
    public boolean validPass(Long id, String oldPass) {
        return false;
    }

    @Override
    public List<SysMenuOperation> listAllMenuAndOperationByUserId(Long userId, Long companyId) {
        return null;
    }

    @Override
    public SysUser validLogin(String accountName, String passWord) {
        return null;
    }

    @Override
    public List<SysUser> findSysUser(SysUser sysuser) {
        return null;
    }

    @Override
    public List<SysUser> findSysUserList(String ids) {
        return null;
    }

    @Override
    public PagingResult<SysUser> userList(SysUser sysUser, LayuiPage page) {
        return null;
    }
}