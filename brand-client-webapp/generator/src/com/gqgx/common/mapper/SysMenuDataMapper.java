package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysMenuData;
import com.gqgx.common.entity.SysMenuDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuDataMapper {
    int countByExample(SysMenuDataExample example);

    int deleteByExample(SysMenuDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMenuData record);

    int insertSelective(SysMenuData record);

    List<SysMenuData> selectByExample(SysMenuDataExample example);

    SysMenuData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMenuData record, @Param("example") SysMenuDataExample example);

    int updateByExample(@Param("record") SysMenuData record, @Param("example") SysMenuDataExample example);

    int updateByPrimaryKeySelective(SysMenuData record);

    int updateByPrimaryKey(SysMenuData record);
}