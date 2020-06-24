package com.gqgx.common.service;

import java.util.List;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.vo.BrandLargeTypeVo;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;


public interface BrandLargeTypeService {

    BrandLargeType getBrandLargeType(Long id);

    int saveBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeTypeByIds(Long[] ids);

    PagingResult<BrandLargeType> findBrandLargeType(Criteria criteria);
    
    PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType,LayuiPage page);
    
    List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type);
}