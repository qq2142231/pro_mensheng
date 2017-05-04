package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.CourseList;
import com.cn.mensheng.course.module.CourseListKey;

public interface CourseListMapper {
    int deleteByPrimaryKey(CourseListKey key);

    int insert(CourseList record);

    int insertSelective(CourseList record);

    CourseList selectByPrimaryKey(CourseListKey key);

    int updateByPrimaryKeySelective(CourseList record);

    int updateByPrimaryKey(CourseList record);
}