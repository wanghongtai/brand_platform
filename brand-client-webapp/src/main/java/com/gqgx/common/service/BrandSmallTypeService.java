package com.gqgx.common.service;

import java.util.List;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandSmallType;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;

public interface BrandSmallTypeService {

	BrandSmallType getBrandSmallType(String smallNo);

	BrandSmallType getBrandSmallType(Long SmallTypeId);

	int saveBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallTypeByIds(Long[] ids);

	PagingResult<BrandSmallType> findBrandSmallType(Criteria criteria);

	PagingResult<BrandSmallType> findBrandSmallType(BrandSmallType brandSmallType, LayuiPage page);

	List<BrandSmallType> findBrandSmallTypeList(BrandSmallType brandSmallType);
}