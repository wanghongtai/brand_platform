package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandNavItem;
import com.gqgx.common.entity.BrandNavItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandNavItemMapper {
    int countByExample(BrandNavItemExample example);

    int deleteByExample(BrandNavItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandNavItem record);

    int insertSelective(BrandNavItem record);

    List<BrandNavItem> selectByExample(BrandNavItemExample example);

    BrandNavItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandNavItem record, @Param("example") BrandNavItemExample example);

    int updateByExample(@Param("record") BrandNavItem record, @Param("example") BrandNavItemExample example);

    int updateByPrimaryKeySelective(BrandNavItem record);

    int updateByPrimaryKey(BrandNavItem record);
}