package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandDycTypeItem;
import com.gqgx.common.entity.BrandDycTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandDycTypeItemMapper {
    int countByExample(BrandDycTypeItemExample example);

    int deleteByExample(BrandDycTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandDycTypeItem record);

    int insertSelective(BrandDycTypeItem record);

    List<BrandDycTypeItem> selectByExample(BrandDycTypeItemExample example);

    BrandDycTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandDycTypeItem record, @Param("example") BrandDycTypeItemExample example);

    int updateByExample(@Param("record") BrandDycTypeItem record, @Param("example") BrandDycTypeItemExample example);

    int updateByPrimaryKeySelective(BrandDycTypeItem record);

    int updateByPrimaryKey(BrandDycTypeItem record);
}