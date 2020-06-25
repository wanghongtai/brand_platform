package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandGnSmalltypeItem;
import com.gqgx.common.entity.vo.BrandGnSmalltypeItemVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandGnSmalltypeItemMapper extends Mapper<BrandGnSmalltypeItem> {

    List<BrandGnSmalltypeItem> findByBrandGnSmalltypeItemVo(BrandGnSmalltypeItemVo vo);
}