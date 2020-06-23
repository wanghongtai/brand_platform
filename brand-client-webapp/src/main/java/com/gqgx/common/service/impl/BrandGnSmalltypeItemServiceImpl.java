package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandGnSmalltypeItem;
import com.gqgx.common.entity.BrandGnSmalltypeItemExample;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandGnSmalltypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandGnSmalltypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandGnSmalltypeItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandGnSmalltypeItemServiceImpl implements BrandGnSmalltypeItemService {

    @Autowired
    protected BrandGnSmalltypeItemMapper brandGnSmalltypeItemDAO;


    @Override
    public BrandGnSmalltypeItem getBrandGnSmalltypeItem(Long id) {
        return null;
    }

    @Override
    public int saveBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem) {
        return 0;
    }

    @Override
    public int deleteBrandGnSmalltypeItemByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItem(BrandGnSmalltypeItem item, LayuiPage page) {
        return null;
    }

    @Override
    public PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItemList(BrandGnSmalltypeItemVo item, LayuiPage page) {

        BrandGnSmalltypeItemExample example = new BrandGnSmalltypeItemExample();
        BrandGnSmalltypeItemExample.Criteria criteria = example.createCriteria();
        /*if(!Objects.isEmpty(item.getLargeTypeId())) {
        }*/

        if(!Objects.isEmpty(item.getSmallTypeId())) {
            criteria.andSmallTypeIdEqualTo(item.getSmallTypeId());
        }

        /*if(!Objects.isEmpty(item.getFilter())) {
        }*/

        criteria.andRecordStatusEqualTo(RecordStatus.ACTIVE);

        example.setOrderByClause("A.group_no, A.project_no ASC");

        if(page!=null){
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandGnSmalltypeItem> list = brandGnSmalltypeItemDAO.selectByExample(example);

        PagingResult<BrandGnSmalltypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }

}