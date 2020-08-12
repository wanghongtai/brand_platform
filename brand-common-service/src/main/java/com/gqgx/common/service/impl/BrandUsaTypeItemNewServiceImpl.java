package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandUsaTypeItem;
import com.gqgx.common.entity.BrandUsaTypeItemNew;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandUsaTypeItemNewVo;
import com.gqgx.common.entity.vo.BrandUsaTypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandUsaTypeItemMapper;
import com.gqgx.common.mapper.BrandUsaTypeItemNewMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandUsaTypeItemNewService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class BrandUsaTypeItemNewServiceImpl implements BrandUsaTypeItemNewService {

    @Autowired
    protected BrandUsaTypeItemNewMapper mapper;


    @Override
    public BrandUsaTypeItemNew getBrandUsaTypeItemNew(Long id) {

        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveBrandUsaTypeItemNew(BrandUsaTypeItemNew item) {
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
    public int deleteBrandUsaTypeItemNew(BrandUsaTypeItemNew item) {

        return mapper.delete(item);
    }

    @Override
    public int deleteBrandUsaTypeItemNewByIds(Long[] ids) {

        return mapper.deleteByIds(ids);
    }

    @Override
    public PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNew(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNew(BrandUsaTypeItemNew item, LayuiPage page) {
        Example example = new Example(BrandUsaTypeItem.class);
        example.setOrderByClause("create_date DESC");

        if(!Objects.isEmpty(item.getProjectName())) {
            example.createCriteria().andLike("projectName", item.getProjectName().trim());
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandUsaTypeItemNew> list = mapper.selectByExample(example);

        PagingResult<BrandUsaTypeItemNew> pageResult = new PagingResult<>(list);
        return pageResult;
    }

    @Override
    public PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNewList(BrandUsaTypeItemNewVo vo, LayuiPage page) {
        Example example = new Example(BrandUsaTypeItemNew.class);
        Example.Criteria cb = example.createCriteria();

        cb.andEqualTo("recordStatus", RecordStatus.ACTIVE);
        example.setOrderByClause("type_no project_name ASC");
        if(!Objects.isEmpty(vo.getLargeTypeId())) {
            cb.andEqualTo("largeTypeId", vo.getLargeTypeId());
        }

        //复杂 or条件查询
        Weekend<BrandUsaTypeItem> weekend = new Weekend<>(BrandUsaTypeItem.class);
        WeekendCriteria<BrandUsaTypeItem, Object> keywordCriteria = weekend.weekendCriteria();
        if (!Objects.isEmpty(vo.getFilter())) {
            keywordCriteria.orLike("typeNo", "%" + vo.getFilter().trim() + "%")
                    .orLike("projectName", "%" + vo.getFilter().trim() + "%")
                    .orLike("projectTranslation", "%" + vo.getFilter().trim() + "%");

        }
        weekend.and(cb);

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandUsaTypeItemNew> list = mapper.selectByExample(weekend);

        PagingResult<BrandUsaTypeItemNew> pageResult = new PagingResult<>(list);
        return pageResult;

    }
}