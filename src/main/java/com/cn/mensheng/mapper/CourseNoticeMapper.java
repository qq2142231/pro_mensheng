package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.CourseNotice;

public interface CourseNoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(CourseNotice record);

    int insertSelective(CourseNotice record);

    CourseNotice selectByPrimaryKey(Integer noticeId);

    int updateByPrimaryKeySelective(CourseNotice record);

    int updateByPrimaryKey(CourseNotice record);
}