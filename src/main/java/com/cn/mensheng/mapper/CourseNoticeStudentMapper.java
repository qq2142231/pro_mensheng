package com.cn.mensheng.mapper;

import com.cn.mensheng.dto.CourseNoticeStudentKey;

public interface CourseNoticeStudentMapper {
    int deleteByPrimaryKey(CourseNoticeStudentKey key);

    int insert(CourseNoticeStudentKey record);

    int insertSelective(CourseNoticeStudentKey record);
}