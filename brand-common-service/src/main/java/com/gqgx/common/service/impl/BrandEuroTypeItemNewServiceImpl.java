package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.entity.BrandEuroTypeItem;
import com.gqgx.common.entity.BrandEuroTypeItemNew;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandEuroTypeItemNewVo;
import com.gqgx.common.entity.vo.BrandEuroTypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandEuroTypeItemNewMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandEuroTypeItemNewService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class BrandEuroTypeItemNewServiceImpl implements BrandEuroTypeItemNewService {

    @Autowired
    protected BrandEuroTypeItemNewMapper mapper;

    @Override
    public BrandEuroTypeItemNew getById(Long id) {

        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(BrandEuroTypeItemNew item) {
        int count = 0;
        if(!Objects.isEmpty(item.getId())){
            count = mapper.updateByPrimaryKeySelective(item);
        }else{
            item.setRecordStatus(RecordStatus.ACTIVE);
            item.setUpdateCount(0);
            item.setCreateDate(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int delete(BrandEuroTypeItemNew item) {

        return mapper.deleteByPrimaryKey(item);
    }

    @Override
    public int deleteByIds(Long[] ids) {

        return mapper.deleteByIds(ids);
    }


    @Override
    public PagingResult<BrandEuroTypeItemNew> findBrandEuroTypeItemNew(BrandEuroTypeItemNew item, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);
        example.setOrderByClause("create_date DESC");

        if(!Objects.isEmpty(item.getProjectName())) {
            example.createCriteria().andLike("projectName", "%"+item.getProjectName().trim()+"%");
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandEuroTypeItemNew> list = mapper.selectByExample(example);

        PagingResult<BrandEuroTypeItemNew> pageResult = new PagingResult<>(list);
        return pageResult;
    }

    @Override
    public PagingResult<BrandEuroTypeItemNew> findBrandEuroTypeItemNewList(BrandEuroTypeItemNewVo item, LayuiPage page) {
        Example example = new Example(BrandEuroTypeItem.class);
        Example.Criteria criteria = example.createCriteria();

        example.setOrderByClause("type_no project_name ASC");
        criteria.andEqualTo("recordStatus", RecordStatus.ACTIVE);

        if(!Objects.isEmpty(item.getLargeTypeId())) {
            criteria.andEqualTo("largeTypeId", item.getLargeTypeId());
        }
        //复杂 or条件查询
        Weekend<BrandEuroTypeItem> weekend = new Weekend<>(BrandEuroTypeItem.class);
        WeekendCriteria<BrandEuroTypeItem, Object> keywordCriteria = weekend.weekendCriteria();
        if (!Objects.isEmpty(item.getFilter())) {
            keywordCriteria.orLike("typeNo", "%" + item.getFilter().trim() + "%")
                    .orLike("projectName", "%" + item.getFilter().trim() + "%");
                   // .orLike("projectTranslation", "%" + item.getFilter().trim() + "%");
    }
        weekend.and(criteria);

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandEuroTypeItemNew> list = mapper.selectByExample(weekend);

        PagingResult<BrandEuroTypeItemNew> pageResult = new PagingResult<>(list);
        return pageResult;
    }

}