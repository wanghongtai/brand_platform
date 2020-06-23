package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandUsaTypeItem;
import com.gqgx.common.entity.vo.BrandUsaTypeItemVo;
import com.gqgx.common.mapper.BrandUsaTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandUsaTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class BrandUsaTypeItemServiceImpl implements BrandUsaTypeItemService {

    @Autowired
    protected BrandUsaTypeItemMapper brandUsaTypeItemDAO;


    @Override
    public BrandUsaTypeItem getBrandUsaTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandUsaTypeItem(BrandUsaTypeItem brandUsaTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandUsaTypeItem(BrandUsaTypeItem brandUsaTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandUsaTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandUsaTypeItem> findBrandUsaTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandUsaTypeItem> findBrandUsaTypeItem(BrandUsaTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandUsaTypeItem> findBrandUsaTypeItemList(BrandUsaTypeItemVo vo, LayuiPage page) {
        return null;
    }
}