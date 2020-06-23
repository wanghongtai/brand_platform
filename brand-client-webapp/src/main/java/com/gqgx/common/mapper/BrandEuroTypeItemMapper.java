package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandEuroTypeItem;
import com.gqgx.common.entity.BrandEuroTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandEuroTypeItemMapper {
    int countByExample(BrandEuroTypeItemExample example);

    int deleteByExample(BrandEuroTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandEuroTypeItem record);

    int insertSelective(BrandEuroTypeItem record);

    List<BrandEuroTypeItem> selectByExample(BrandEuroTypeItemExample example);

    BrandEuroTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandEuroTypeItem record, @Param("example") BrandEuroTypeItemExample example);

    int updateByExample(@Param("record") BrandEuroTypeItem record, @Param("example") BrandEuroTypeItemExample example);

    int updateByPrimaryKeySelective(BrandEuroTypeItem record);

    int updateByPrimaryKey(BrandEuroTypeItem record);
}