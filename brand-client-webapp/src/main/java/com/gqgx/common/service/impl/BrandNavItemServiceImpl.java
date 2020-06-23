package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandNavItem;
import com.gqgx.common.mapper.BrandNavItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandNavItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandNavItemServiceImpl implements BrandNavItemService {

    @Autowired
    protected BrandNavItemMapper brandNavItemDAO;


	@Override
	public BrandNavItem getBrandNavItem(Long id) {
		return null;
	}

	@Override
	public int saveBrandNavItem(BrandNavItem brandNavItem) {
		return 0;
	}

	@Override
	public int deleteBrandNavItem(BrandNavItem brandNavItem) {
		return 0;
	}

	@Override
	public int deleteBrandNavItemByIds(Long[] ids) {
		return 0;
	}

	@Override
	public PagingResult<BrandNavItem> findBrandNavItem(Criteria criteria) {
		return null;
	}

	@Override
	public List<BrandNavItem> findBrandNavItemList(BrandNavItem item) {
		return null;
	}

	@Override
	public PagingResult<BrandNavItem> findBrandNavItem(BrandNavItem item, LayuiPage page) {
		return null;
	}

	@Override
	public int getMaxSeq() {
		return 0;
	}
}