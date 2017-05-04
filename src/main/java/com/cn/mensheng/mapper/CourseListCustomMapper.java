package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.CourseList;
import com.cn.mensheng.course.module.CourseListCustom;
import com.cn.mensheng.course.module.CourseListKey;

import java.util.List;

public interface CourseListCustomMapper {

    List<CourseListCustom> selectCourseListByStuId(Integer stuId);
}