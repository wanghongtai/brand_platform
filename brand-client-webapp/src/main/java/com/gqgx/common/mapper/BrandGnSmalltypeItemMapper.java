package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandGnSmalltypeItem;
import com.gqgx.common.entity.BrandGnSmalltypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandGnSmalltypeItemMapper {
    int countByExample(BrandGnSmalltypeItemExample example);

    int deleteByExample(BrandGnSmalltypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandGnSmalltypeItem record);

    int insertSelective(BrandGnSmalltypeItem record);

    List<BrandGnSmalltypeItem> selectByExample(BrandGnSmalltypeItemExample example);

    BrandGnSmalltypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandGnSmalltypeItem record, @Param("example") BrandGnSmalltypeItemExample example);

    int updateByExample(@Param("record") BrandGnSmalltypeItem record, @Param("example") BrandGnSmalltypeItemExample example);

    int updateByPrimaryKeySelective(BrandGnSmalltypeItem record);

    int updateByPrimaryKey(BrandGnSmalltypeItem record);
}