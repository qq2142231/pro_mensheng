package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.Section;

public interface SectionMapper {
    int deleteByPrimaryKey(Integer sectionId);

    int insert(Section record);

    int insertSelective(Section record);

    Section selectByPrimaryKey(Integer sectionId);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
}