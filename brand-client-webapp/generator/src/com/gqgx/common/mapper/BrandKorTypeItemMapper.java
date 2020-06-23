package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandKorTypeItem;
import com.gqgx.common.entity.BrandKorTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandKorTypeItemMapper {
    int countByExample(BrandKorTypeItemExample example);

    int deleteByExample(BrandKorTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandKorTypeItem record);

    int insertSelective(BrandKorTypeItem record);

    List<BrandKorTypeItem> selectByExample(BrandKorTypeItemExample example);

    BrandKorTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandKorTypeItem record, @Param("example") BrandKorTypeItemExample example);

    int updateByExample(@Param("record") BrandKorTypeItem record, @Param("example") BrandKorTypeItemExample example);

    int updateByPrimaryKeySelective(BrandKorTypeItem record);

    int updateByPrimaryKey(BrandKorTypeItem record);
}