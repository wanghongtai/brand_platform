package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandSmallType;
import com.gqgx.common.mapper.BrandSmallTypeMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandSmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandSmallTypeServiceImpl implements BrandSmallTypeService {

	@Autowired
	protected BrandSmallTypeMapper brandSmallTypeDAO;

	@Override
	public BrandSmallType getBrandSmallType(String smallNo) {
		return null;
	}

	@Override
	public BrandSmallType getBrandSmallType(Long SmallTypeId) {
		return null;
	}

	@Override
	public int saveBrandSmallType(BrandSmallType brandSmallType) {
		return 0;
	}

	@Override
	public int deleteBrandSmallType(BrandSmallType brandSmallType) {
		return 0;
	}

	@Override
	public int deleteBrandSmallTypeByIds(Long[] ids) {
		return 0;
	}

	@Override
	public PagingResult<BrandSmallType> findBrandSmallType(Criteria criteria) {
		return null;
	}

	@Override
	public PagingResult<BrandSmallType> findBrandSmallType(BrandSmallType brandSmallType, LayuiPage page) {
		return null;
	}

	@Override
	public List<BrandSmallType> findBrandSmallTypeList(BrandSmallType brandSmallType) {
		return null;
	}
}