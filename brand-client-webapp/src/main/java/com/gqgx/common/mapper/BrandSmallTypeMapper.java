package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandSmallType;
import com.gqgx.common.entity.BrandSmallTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandSmallTypeMapper {
    int countByExample(BrandSmallTypeExample example);

    int deleteByExample(BrandSmallTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandSmallType record);

    int insertSelective(BrandSmallType record);

    List<BrandSmallType> selectByExample(BrandSmallTypeExample example);

    BrandSmallType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandSmallType record, @Param("example") BrandSmallTypeExample example);

    int updateByExample(@Param("record") BrandSmallType record, @Param("example") BrandSmallTypeExample example);

    int updateByPrimaryKeySelective(BrandSmallType record);

    int updateByPrimaryKey(BrandSmallType record);
}