package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysUserOnline;
import com.gqgx.common.entity.SysUserOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserOnlineMapper {
    int countByExample(SysUserOnlineExample example);

    int deleteByExample(SysUserOnlineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserOnline record);

    int insertSelective(SysUserOnline record);

    List<SysUserOnline> selectByExample(SysUserOnlineExample example);

    SysUserOnline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

    int updateByExample(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

    int updateByPrimaryKeySelective(SysUserOnline record);

    int updateByPrimaryKey(SysUserOnline record);
}