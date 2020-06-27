package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.GqgxFriendship;
import com.gqgx.common.mapper.GqgxFriendshipMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.GqgxFriendshipService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class GqgxFriendshipServiceImpl implements GqgxFriendshipService {

    @Autowired
    protected GqgxFriendshipMapper gqgxFriendshipDAO;


    @Override
    public GqgxFriendship getGqgxFriendship(Long id) {
        return null;
    }

    @Override
    public int saveGqgxFriendship(GqgxFriendship gqgxFriendship) {
        return 0;
    }

    @Override
    public int deleteGqgxFriendship(GqgxFriendship gqgxFriendship) {
        return 0;
    }

    @Override
    public int deleteGqgxFriendshipByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<GqgxFriendship> findGqgxFriendship(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<GqgxFriendship> findGqgxFriendship(GqgxFriendship gqgxFriendship, LayuiPage page) {
        return null;
    }

    @Override
    public List<GqgxFriendship> getGqgxFriendship(GqgxFriendship gqgxFriendship) {
        return null;
    }
}