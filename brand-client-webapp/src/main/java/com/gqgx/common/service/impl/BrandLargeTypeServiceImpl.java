package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.RecordStatus;
import com.gqgx.common.entity.vo.BrandLargeTypeVo;
import com.gqgx.common.lang.Objects;
import com.gqgx.common.mapper.BrandLargeTypeMapper;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.BrandLargeTypeService;
import javafx.scene.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class BrandLargeTypeServiceImpl implements BrandLargeTypeService {

    @Autowired
    protected BrandLargeTypeMapper brandLargeTypeDAO;


    @Override
    public BrandLargeType getBrandLargeType(Long id) {
        return null;
    }

    @Override
    public int saveBrandLargeType(BrandLargeType brandLargeType) {
        return 0;
    }

    @Override
    public int deleteBrandLargeType(BrandLargeType brandLargeType) {
        return 0;
    }

    @Override
    public int deleteBrandLargeTypeByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(Criteria criteria) {
        return null;
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page) {
        return null;
    }

    @Override
    public List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type) {

        Example example = new Example(BrandLargeType.class);


        if(type != null && !Objects.isEmpty(type.getName())) {
            example.createCriteria().andEqualTo("name", type.getName().trim());
        }
        example.createCriteria().andEqualTo("recordStatus", RecordStatus.ACTIVE);

        example.setOrderByClause("catalog ASC");
        List<BrandLargeType> brandLargeTypeList = brandLargeTypeDAO.selectByExample(example);


        return brandLargeTypeList;
    }
}