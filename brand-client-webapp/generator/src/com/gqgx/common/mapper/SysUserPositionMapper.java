package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysUserPosition;
import com.gqgx.common.entity.SysUserPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPositionMapper {
    int countByExample(SysUserPositionExample example);

    int deleteByExample(SysUserPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserPosition record);

    int insertSelective(SysUserPosition record);

    List<SysUserPosition> selectByExample(SysUserPositionExample example);

    SysUserPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserPosition record, @Param("example") SysUserPositionExample example);

    int updateByExample(@Param("record") SysUserPosition record, @Param("example") SysUserPositionExample example);

    int updateByPrimaryKeySelective(SysUserPosition record);

    int updateByPrimaryKey(SysUserPosition record);
}