package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandAuTypeItem;
import com.gqgx.common.entity.BrandAuTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandAuTypeItemMapper {
    int countByExample(BrandAuTypeItemExample example);

    int deleteByExample(BrandAuTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandAuTypeItem record);

    int insertSelective(BrandAuTypeItem record);

    List<BrandAuTypeItem> selectByExample(BrandAuTypeItemExample example);

    BrandAuTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandAuTypeItem record, @Param("example") BrandAuTypeItemExample example);

    int updateByExample(@Param("record") BrandAuTypeItem record, @Param("example") BrandAuTypeItemExample example);

    int updateByPrimaryKeySelective(BrandAuTypeItem record);

    int updateByPrimaryKey(BrandAuTypeItem record);
}