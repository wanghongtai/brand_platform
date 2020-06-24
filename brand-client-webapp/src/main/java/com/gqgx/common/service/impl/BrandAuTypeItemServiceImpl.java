package com.gqgx.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandAuTypeItem;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandAuTypeItemVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandAuTypeItemMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandAuTypeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@org.springframework.stereotype.Service
public class BrandAuTypeItemServiceImpl implements BrandAuTypeItemService {

    @Autowired
    protected BrandAuTypeItemMapper brandAuTypeItemDAO;


    @Override
    public BrandAuTypeItem getBrandAuTypeItem(Long id) {
        return brandAuTypeItemDAO.selectByPrimaryKey(id);
    }

    @Override
    public int saveBrandAuTypeItem(BrandAuTypeItem item) {
        int count = 0;
        if(!Objects.isEmpty(item.getId())){
            count = brandAuTypeItemDAO.updateByPrimaryKeySelective(item);
        }else{
            //insertSelective插入数据，使用不为null的属性作为字段使用，如 INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? )，Parameters: null, test_insertSelective(String)
            count = brandAuTypeItemDAO.insertSelective(item);
        }
        return count;
    }

    @Override
    public int deleteBrandAuTypeItem(BrandAuTypeItem item) {
        return brandAuTypeItemDAO.deleteByPrimaryKey(item);
    }

    @Override
    public int deleteBrandAuTypeItemByIds(Long[] ids) {
        return brandAuTypeItemDAO.deleteByIds(ids);
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItem(Criteria criteria) {
        //TODO:
        return null;
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItem(BrandAuTypeItem type, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);

        example.setOrderByClause("create_date DESC");
        if(!Objects.isEmpty(type.getProjectName())) {
            example.createCriteria().andEqualTo("project_name", type.getProjectName().trim());
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandAuTypeItem> list = brandAuTypeItemDAO.selectByExample(example);
        PagingResult<BrandAuTypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }

    @Override
    public PagingResult<BrandAuTypeItem> findBrandAuTypeItemList(BrandAuTypeItemVo type, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);

        example.createCriteria().andEqualTo("record_status", RecordStatus.ACTIVE);
        example.setOrderByClause("type_no project_name ASC");
        if(!Objects.isEmpty(type.getLargeTypeId())) {
            example.createCriteria().andEqualTo("large_type_id", type.getLargeTypeId());
        }
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }

        List<BrandAuTypeItem> list = brandAuTypeItemDAO.selectByExample(example);

        PagingResult<BrandAuTypeItem> pageResult = new PagingResult<>(list);
        return pageResult;
    }
}