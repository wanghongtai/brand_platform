package com.gqgx.common.service;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.BrandUsaTypeItemNew;
import com.gqgx.common.entity.vo.BrandUsaTypeItemNewVo;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;


public interface BrandUsaTypeItemNewService {

    BrandUsaTypeItemNew getBrandUsaTypeItemNew(Long id);

    int saveBrandUsaTypeItemNew(BrandUsaTypeItemNew item);

    int deleteBrandUsaTypeItemNew(BrandUsaTypeItemNew item);

    int deleteBrandUsaTypeItemNewByIds(Long[] ids);

    PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNew(Criteria criteria);
    
    PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNew(BrandUsaTypeItemNew item, LayuiPage page);

    PagingResult<BrandUsaTypeItemNew> findBrandUsaTypeItemNewList(BrandUsaTypeItemNewVo vo, LayuiPage page);
}