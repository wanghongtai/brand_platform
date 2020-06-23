package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.BrandLargeTypeExample;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandLargeTypeMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandLargeTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandLargeTypeServiceImpl implements BrandLargeTypeService {

    @Autowired
    protected BrandLargeTypeMapper brandLargeTypeDAO;


    @Override
    public BrandLargeType getBrandLargeType(Long id) {
        return null;
    }

    @Override
    public int saveBrandLargeType(BrandLargeType brandLargeType) {
        return 0;
    }

    @Override
    public int deleteBrandLargeType(BrandLargeType brandLargeType) {
        return 0;
    }

    @Override
    public int deleteBrandLargeTypeByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page) {
        return null;
    }

    @Override
    public List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type) {
        BrandLargeTypeExample example = new BrandLargeTypeExample();
        BrandLargeTypeExample.Criteria criteria = example.createCriteria();

        if(type != null && !Objects.isEmpty(type.getName())) {
            criteria.andNameLike(type.getName().trim());
        }
        criteria.andRecordStatusEqualTo( RecordStatus.ACTIVE);

        example.setOrderByClause("A.catalog ASC");
        return brandLargeTypeDAO.selectByExample(example);
    }
}