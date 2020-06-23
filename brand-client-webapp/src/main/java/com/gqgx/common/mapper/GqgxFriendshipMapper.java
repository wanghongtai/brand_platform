package com.gqgx.common.mapper;

import com.gqgx.common.entity.GqgxFriendship;
import com.gqgx.common.entity.GqgxFriendshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GqgxFriendshipMapper {
    int countByExample(GqgxFriendshipExample example);

    int deleteByExample(GqgxFriendshipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GqgxFriendship record);

    int insertSelective(GqgxFriendship record);

    List<GqgxFriendship> selectByExample(GqgxFriendshipExample example);

    GqgxFriendship selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GqgxFriendship record, @Param("example") GqgxFriendshipExample example);

    int updateByExample(@Param("record") GqgxFriendship record, @Param("example") GqgxFriendshipExample example);

    int updateByPrimaryKeySelective(GqgxFriendship record);

    int updateByPrimaryKey(GqgxFriendship record);
}