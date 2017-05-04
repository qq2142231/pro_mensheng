package com.cn.mensheng.mapper;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.dto.WorkSubmitKey;

public interface WorkSubmitMapper {
    int deleteByPrimaryKey(WorkSubmitKey key);

    int insert(WorkSubmit record);

    int insertSelective(WorkSubmit record);

    WorkSubmit selectByPrimaryKey(WorkSubmitKey key);

    int updateByPrimaryKeySelective(WorkSubmit record);

    int updateByPrimaryKey(WorkSubmit record);
}