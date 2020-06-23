package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandDycTypeItem;
import com.gqgx.common.entity.vo.BrandDycTypeItemVo;
import com.gqgx.common.mapper.BrandDycTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.gqgx.common.service.BrandDycTypeItemService;
import org.springframework.stereotype.Service;

@Service
public class BrandDycTypeItemServiceImpl implements BrandDycTypeItemService {

    @Autowired
    protected BrandDycTypeItemMapper brandDycTypeItemMapper;


	@Override
	public BrandDycTypeItem getBrandDycTypeItem(Long id) {
		return null;
	}

	@Override
	public int saveBrandDycTypeItem(BrandDycTypeItem brandDycTypeItem) {
		return 0;
	}

	@Override
	public int deleteBrandDycTypeItem(BrandDycTypeItem brandDycTypeItem) {
		return 0;
	}

	@Override
	public int deleteBrandDycTypeItemByIds(Long[] ids) {
		return 0;
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItem(Criteria criteria) {
		return null;
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItem(BrandDycTypeItem item, LayuiPage page) {
		return null;
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItemList(BrandDycTypeItemVo vo, LayuiPage page) {
		return null;
	}
}