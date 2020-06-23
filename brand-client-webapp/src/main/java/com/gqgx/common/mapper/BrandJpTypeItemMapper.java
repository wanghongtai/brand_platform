package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandJpTypeItem;
import com.gqgx.common.entity.BrandJpTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandJpTypeItemMapper {
    int countByExample(BrandJpTypeItemExample example);

    int deleteByExample(BrandJpTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandJpTypeItem record);

    int insertSelective(BrandJpTypeItem record);

    List<BrandJpTypeItem> selectByExample(BrandJpTypeItemExample example);

    BrandJpTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandJpTypeItem record, @Param("example") BrandJpTypeItemExample example);

    int updateByExample(@Param("record") BrandJpTypeItem record, @Param("example") BrandJpTypeItemExample example);

    int updateByPrimaryKeySelective(BrandJpTypeItem record);

    int updateByPrimaryKey(BrandJpTypeItem record);
}