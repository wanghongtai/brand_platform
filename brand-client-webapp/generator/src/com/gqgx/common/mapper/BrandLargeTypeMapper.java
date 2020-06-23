package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.BrandLargeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandLargeTypeMapper {
    int countByExample(BrandLargeTypeExample example);

    int deleteByExample(BrandLargeTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandLargeType record);

    int insertSelective(BrandLargeType record);

    List<BrandLargeType> selectByExample(BrandLargeTypeExample example);

    BrandLargeType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandLargeType record, @Param("example") BrandLargeTypeExample example);

    int updateByExample(@Param("record") BrandLargeType record, @Param("example") BrandLargeTypeExample example);

    int updateByPrimaryKeySelective(BrandLargeType record);

    int updateByPrimaryKey(BrandLargeType record);
}