package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandAuTypeItem;
import com.gqgx.common.entity.vo.BrandAuTypeItemVo;
import com.gqgx.common.mapper.BrandAuTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandAuTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class BrandAuTypeItemServiceImpl implements BrandAuTypeItemService {

    @Autowired
    protected BrandAuTypeItemMapper brandAuTypeItemDAO;


    @Override
    public BrandAuTypeItem getBrandAuTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandAuTypeItem(BrandAuTypeItem brandAuTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandAuTypeItem(BrandAuTypeItem brandAuTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandAuTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItem(BrandAuTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItemList(BrandAuTypeItemVo vo, LayuiPage page) {
        return null;
    }
}