package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandEuroTypeItem;
import com.gqgx.common.entity.BrandGnSmalltypeItem;
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
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

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
        Example.Criteria criteria = example.createCriteria();

        example.setOrderByClause("type_no project_name ASC");
        criteria.andEqualTo("record_status", RecordStatus.ACTIVE);

        if(!Objects.isEmpty(item.getLargeTypeId())) {
            criteria.andEqualTo("large_type_id", item.getLargeTypeId());
        }
        //复杂 or条件查询
        Weekend<BrandGnSmalltypeItem> weekend = new Weekend<>(BrandGnSmalltypeItem.class);
        WeekendCriteria<BrandGnSmalltypeItem, Object> keywordCriteria = weekend.weekendCriteria();
        if (!Objects.isEmpty(item.getFilter())) {
            keywordCriteria.orLike("typeNo", "%" + item.getFilter().trim() + "%")
                    .orLike("projectCnname", "%" + item.getFilter().trim() + "%");
        }
        weekend.and(criteria);

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandEuroTypeItem> list = mapper.selectByExample(weekend);

        PagingResult<BrandEuroTypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }

}