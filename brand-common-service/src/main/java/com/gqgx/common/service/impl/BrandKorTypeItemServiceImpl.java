package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandKorTypeItem;
import com.gqgx.common.entity.vo.BrandKorTypeItemVo;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandKorTypeItemService;

@org.springframework.stereotype.Service
public class BrandKorTypeItemServiceImpl implements BrandKorTypeItemService {

    @Override
    public BrandKorTypeItem getBrandKorTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandKorTypeItem(BrandKorTypeItem brandKorTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandKorTypeItem(BrandKorTypeItem brandKorTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandKorTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandKorTypeItem> findBrandKorTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandKorTypeItem> findBrandKorTypeItem(BrandKorTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandKorTypeItem> findBrandKorTypeItemList(BrandKorTypeItemVo vo, LayuiPage page) {
        return null;
    }
}