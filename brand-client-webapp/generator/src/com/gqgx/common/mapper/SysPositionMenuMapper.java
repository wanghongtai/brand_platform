package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysPositionMenu;
import com.gqgx.common.entity.SysPositionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPositionMenuMapper {
    int countByExample(SysPositionMenuExample example);

    int deleteByExample(SysPositionMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPositionMenu record);

    int insertSelective(SysPositionMenu record);

    List<SysPositionMenu> selectByExample(SysPositionMenuExample example);

    SysPositionMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPositionMenu record, @Param("example") SysPositionMenuExample example);

    int updateByExample(@Param("record") SysPositionMenu record, @Param("example") SysPositionMenuExample example);

    int updateByPrimaryKeySelective(SysPositionMenu record);

    int updateByPrimaryKey(SysPositionMenu record);
}