package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandEuroTypeItem;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandEuroTypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandEuroTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandEuroTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandEuroTypeItemServiceImpl implements BrandEuroTypeItemService {

    @Autowired
    protected BrandEuroTypeItemMapper mapper;

    @Override
    public BrandEuroTypeItem getBrandEuroTypeItem(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveBrandEuroTypeItem(BrandEuroTypeItem item) {
        int count = 0;
        if(!Objects.isEmpty(item.getId())){
            count = mapper.updateByPrimaryKeySelective(item);
        }else{
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int deleteBrandEuroTypeItem(BrandEuroTypeItem item) {
        return mapper.deleteByPrimaryKey(item);
    }

    @Override
    public int deleteBrandEuroTypeItemByIds(Long[] ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItem(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItem(BrandEuroTypeItem item, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);
        example.setOrderByClause("create_date DESC");

        if(!Objects.isEmpty(item.getProjectName())) {
            example.createCriteria().andLike("project_name", item.getProjectName().trim());
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandEuroTypeItem> list = mapper.selectByExample(example);

        PagingResult<BrandEuroTypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }

    @Override
    public PagingResult<BrandEuroTypeItem> findBrandEuroTypeItemList(BrandEuroTypeItemVo item, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);
        example.setOrderByClause("type_no project_name ASC");
        example.createCriteria().andEqualTo("record_status", RecordStatus.ACTIVE);

        if(!Objects.isEmpty(item.getLargeTypeId())) {
            example.createCriteria().andEqualTo("large_type_id", item.getLargeTypeId());
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandEuroTypeItem> list = mapper.selectByExample(example);

        PagingResult<BrandEuroTypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }

}