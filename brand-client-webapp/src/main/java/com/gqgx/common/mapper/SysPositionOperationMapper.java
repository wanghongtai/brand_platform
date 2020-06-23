package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysPositionOperation;
import com.gqgx.common.entity.SysPositionOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPositionOperationMapper {
    int countByExample(SysPositionOperationExample example);

    int deleteByExample(SysPositionOperationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPositionOperation record);

    int insertSelective(SysPositionOperation record);

    List<SysPositionOperation> selectByExample(SysPositionOperationExample example);

    SysPositionOperation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPositionOperation record, @Param("example") SysPositionOperationExample example);

    int updateByExample(@Param("record") SysPositionOperation record, @Param("example") SysPositionOperationExample example);

    int updateByPrimaryKeySelective(SysPositionOperation record);

    int updateByPrimaryKey(SysPositionOperation record);
}