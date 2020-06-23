package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandUsaTypeItem;
import com.gqgx.common.entity.BrandUsaTypeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandUsaTypeItemMapper {
    int countByExample(BrandUsaTypeItemExample example);

    int deleteByExample(BrandUsaTypeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandUsaTypeItem record);

    int insertSelective(BrandUsaTypeItem record);

    List<BrandUsaTypeItem> selectByExample(BrandUsaTypeItemExample example);

    BrandUsaTypeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandUsaTypeItem record, @Param("example") BrandUsaTypeItemExample example);

    int updateByExample(@Param("record") BrandUsaTypeItem record, @Param("example") BrandUsaTypeItemExample example);

    int updateByPrimaryKeySelective(BrandUsaTypeItem record);

    int updateByPrimaryKey(BrandUsaTypeItem record);
}