package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandRussiaTypeItem;
import com.gqgx.common.entity.BrandRussiaTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandRussiaTypeItemMapper {
    int countByExample(BrandRussiaTypeItemExample example);

    int deleteByExample(BrandRussiaTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandRussiaTypeItem record);

    int insertSelective(BrandRussiaTypeItem record);

    List<BrandRussiaTypeItem> selectByExampleWithBLOBs(BrandRussiaTypeItemExample example);

    List<BrandRussiaTypeItem> selectByExample(BrandRussiaTypeItemExample example);

    BrandRussiaTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandRussiaTypeItem record, @Param("example") BrandRussiaTypeItemExample example);

    int updateByExampleWithBLOBs(@Param("record") BrandRussiaTypeItem record, @Param("example") BrandRussiaTypeItemExample example);

    int updateByExample(@Param("record") BrandRussiaTypeItem record, @Param("example") BrandRussiaTypeItemExample example);

    int updateByPrimaryKeySelective(BrandRussiaTypeItem record);

    int updateByPrimaryKeyWithBLOBs(BrandRussiaTypeItem record);

    int updateByPrimaryKey(BrandRussiaTypeItem record);
}