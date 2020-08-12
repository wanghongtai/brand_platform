package com.gqgx.common.service;

import com.gqgx.common.entity.BrandEuroTypeItemNew;
import com.gqgx.common.entity.vo.BrandEuroTypeItemNewVo;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;


public interface BrandEuroTypeItemNewService {

    BrandEuroTypeItemNew getById(Long id);

    int save(BrandEuroTypeItemNew item);

    int delete(BrandEuroTypeItemNew item);

    int deleteByIds(Long[] ids);

    PagingResult<BrandEuroTypeItemNew> findBrandEuroTypeItemNew(BrandEuroTypeItemNew item, LayuiPage page);

    PagingResult<BrandEuroTypeItemNew> findBrandEuroTypeItemNewList(BrandEuroTypeItemNewVo vo, LayuiPage page);
}