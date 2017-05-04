package com.cn.mensheng.mapper;


import com.cn.mensheng.course.module.CourseNotice;

import java.util.List;

public interface CourseNoticeCustomMapper {

    List<CourseNotice> selectCourseNoticeListByCourseId(Integer courseId);
}