package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.CourseType;

public interface CourseTypeMapper {
    int deleteByPrimaryKey(Integer ctypeId);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    CourseType selectByPrimaryKey(Integer ctypeId);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
}