package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.BoardManagerKey;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface BoardManagerMapper {
    int deleteByPrimaryKey(BoardManagerKey key);

    int insert(BoardManagerKey record);

    int insertSelective(BoardManagerKey record);
}