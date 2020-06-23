package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandEuroTypeItem;
import com.gqgx.common.entity.vo.BrandEuroTypeItemVo;
import com.gqgx.common.mapper.BrandEuroTypeItemMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandEuroTypeItemService;

@org.springframework.stereotype.Service
public class BrandEuroTypeItemServiceImpl implements BrandEuroTypeItemService {

    @Autowired
    protected BrandEuroTypeItemMapper brandEuroTypeItemDAO;

    @Override
    public BrandEuroTypeItem getBrandEuroTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandEuroTypeItem(BrandEuroTypeItem brandEuroTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandEuroTypeItem(BrandEuroTypeItem brandEuroTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandEuroTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItem(BrandEuroTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItemList(BrandEuroTypeItemVo vo, LayuiPage page) {
        return null;
    }

}