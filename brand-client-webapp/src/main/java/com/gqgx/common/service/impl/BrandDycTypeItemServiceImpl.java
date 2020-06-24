package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandDycTypeItem;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandDycTypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandDycTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandDycTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BrandDycTypeItemServiceImpl implements BrandDycTypeItemService {

    @Autowired
    protected BrandDycTypeItemMapper mapper;


	@Override
	public BrandDycTypeItem getBrandDycTypeItem(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveBrandDycTypeItem(BrandDycTypeItem item) {
		int count = 0;
		if(!Objects.isEmpty(item.getId())){
			count = mapper.updateByPrimaryKeySelective(item);
		}else{
			count = mapper.insertSelective(item);
		}
		return count;
	}

	@Override
	public int deleteBrandDycTypeItem(BrandDycTypeItem item) {
		return mapper.deleteByPrimaryKey(item);
	}

	@Override
	public int deleteBrandDycTypeItemByIds(Long[] ids) {
		return mapper.deleteByIds(ids);
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItem(Criteria criteria) {
		return null;
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItem(BrandDycTypeItem item, LayuiPage page) {
		Example example = new Example(BrandLargeType.class);

		example.setOrderByClause("create_date DESC");
		example.createCriteria().andEqualTo("record_status", RecordStatus.ACTIVE);

		if(!Objects.isEmpty(item.getProjectName())) {
			example.createCriteria().andEqualTo("project_name", item.getProjectName().trim());
		}
		if(!Objects.isEmpty(item.getNavItemId())) {
			example.createCriteria().andEqualTo("nav_item_id", item.getNavItemId());
		}
		if (page != null) {
			PageHelper.startPage(page.getPage(), page.getLimit());
		}
		List<BrandDycTypeItem> list = mapper.selectByExample(example);

		PagingResult<BrandDycTypeItem> pageResult = new PagingResult<>(list);
		return pageResult;
	}

	@Override
	public PagingResult<BrandDycTypeItem> findBrandDycTypeItemList(BrandDycTypeItemVo item, LayuiPage page) {
		Example example = new Example(BrandLargeType.class);
		example.setOrderByClause("create_date DESC");
		example.createCriteria().andEqualTo("record_status", RecordStatus.ACTIVE);

		if(!Objects.isEmpty(item.getProjectName())) {
			example.createCriteria().andEqualTo("project_name", item.getProjectName().trim());
		}
		if(!Objects.isEmpty(item.getNavItemId())) {
			example.createCriteria().andEqualTo("nav_item_id", item.getNavItemId());
		}
		if (page != null) {
			PageHelper.startPage(page.getPage(), page.getLimit());
		}

		List<BrandDycTypeItem> list = mapper.selectByExample(example);
		PagingResult<BrandDycTypeItem> pageResult = new PagingResult<>(list);
		return pageResult;
	}
}