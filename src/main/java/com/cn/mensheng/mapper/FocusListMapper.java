package com.cn.mensheng.mapper;

import com.cn.mensheng.dto.FocusListKey;

public interface FocusListMapper {
    int deleteByPrimaryKey(FocusListKey key);

    int insert(FocusListKey record);

    int insertSelective(FocusListKey record);
}