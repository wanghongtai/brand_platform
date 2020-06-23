package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysMenuOperation;
import com.gqgx.common.entity.SysMenuOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuOperationMapper {
    int countByExample(SysMenuOperationExample example);

    int deleteByExample(SysMenuOperationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMenuOperation record);

    int insertSelective(SysMenuOperation record);

    List<SysMenuOperation> selectByExample(SysMenuOperationExample example);

    SysMenuOperation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMenuOperation record, @Param("example") SysMenuOperationExample example);

    int updateByExample(@Param("record") SysMenuOperation record, @Param("example") SysMenuOperationExample example);

    int updateByPrimaryKeySelective(SysMenuOperation record);

    int updateByPrimaryKey(SysMenuOperation record);
}