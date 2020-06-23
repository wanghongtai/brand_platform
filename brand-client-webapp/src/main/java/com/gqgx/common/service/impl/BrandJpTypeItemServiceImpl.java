package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandJpTypeItem;
import com.gqgx.common.entity.vo.BrandJpTypeItemVo;
import com.gqgx.common.mapper.BrandJpTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandJpTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class BrandJpTypeItemServiceImpl implements BrandJpTypeItemService {

    @Autowired
    protected BrandJpTypeItemMapper brandJpTypeItemDAO;


    @Override
    public BrandJpTypeItem getBrandJpTypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandJpTypeItem(BrandJpTypeItem brandJpTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandJpTypeItem(BrandJpTypeItem brandJpTypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandJpTypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandJpTypeItem> findBrandJpTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandJpTypeItem> findBrandJpTypeItem(BrandJpTypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandJpTypeItem> findBrandJpTypeItemList(BrandJpTypeItemVo vo, LayuiPage page) {
        return null;
    }

}