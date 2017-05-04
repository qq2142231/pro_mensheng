package com.cn.mensheng.course.service;

import com.cn.mensheng.course.module.CourseList;
import com.cn.mensheng.course.module.CourseListCustom;
import com.cn.mensheng.course.module.CourseListKey;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
public interface CourseListService {
    //获取某个学生的所有课程表,包括course.courseName,course.courseId,course.hour,
    //coursetype.ctypeName,coursetype.isCharge,coursetype.isLive,coursetype.isPublic,coursetype.password,
    //courselist.*
    public List<CourseListCustom> selectCourseListByStuId(Integer stuId) throws Exception;
    //获取学生选择的某个课程表
    public CourseList selectCourseListByPrimaryKey(CourseListKey key)throws Exception;
    //学生参加课程，即添加课程表
    public int insertCourseList(CourseList courseList) throws Exception;
    //学生移除课程，即删除课程表
    public int deleteCourseList(CourseListKey key) throws Exception;
    //更新课程表,进度，学习时间等等
    public int updateCourseList(CourseList courseList) throws Exception;
}
