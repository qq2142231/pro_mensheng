package com.cn.mensheng.mapper;

import com.cn.mensheng.exam.module.TestPaperKey;

public interface TestPaperMapper {
    int deleteByPrimaryKey(TestPaperKey key);

    int insert(TestPaperKey record);

    int insertSelective(TestPaperKey record);
}