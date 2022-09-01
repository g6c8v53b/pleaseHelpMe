package com.qf.tx.mapper;

import com.qf.tx.entity.Human;
import org.apache.ibatis.annotations.Param;

public interface HumanMapper {
    int insert(@Param("human") Human human);
}
