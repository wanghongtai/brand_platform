package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandRussiaTypeItem;
import com.gqgx.common.mapper.BrandRussiaTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandRussiaTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class BrandRussiaTypeItemServiceImpl implements BrandRussiaTypeItemService {

    @Autowired
    protected BrandRussiaTypeItemMapper brandRussiaTypeItemDAO;


    @Override
    public BrandRussiaTypeItem getBrandRussiaTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandRussiaTypeItem(BrandRussiaTypeItem brandRussiaTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandRussiaTypeItem(BrandRussiaTypeItem brandRussiaTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandRussiaTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandRussiaTypeItem> findBrandRussiaTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandRussiaTypeItem> findBrandRussiaTypeItem(BrandRussiaTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public BrandRussiaTypeItem findBrandRussiaTypeItemByLargeId(Long largeTypeId) {
        return null;
    }
}