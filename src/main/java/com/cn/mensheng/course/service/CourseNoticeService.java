package com.cn.mensheng.course.service;

import com.cn.mensheng.course.module.CourseNotice;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
public interface CourseNoticeService {
    //获取某课的所有课程通知
    public List<CourseNotice> selectCourseNoticeList(Integer courseId) throws Exception;
    //添加课程通知
    public int insertCourseNotice(CourseNotice courseNotice) throws Exception;
    //删除课程通知
    public int deleteCourseNotice(Integer noticeId) throws Exception;
    //更改课程通知
    public int updateCourseNotice(CourseNotice courseNotice) throws Exception;
    //获取课程通知
    public CourseNotice selectCourseNotice(Integer noticeId) throws Exception;

}
