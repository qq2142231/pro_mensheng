package com.cn.mensheng.course.service;

import com.cn.mensheng.course.module.CourseList;

import java.util.List;

/**
 * Created by lenovo on 2017/5/3.
 */
public interface All_CourseService {

    public List<CourseList> selectAllCourseByCourseId_up() throws Exception;

    public List<CourseList> selectBytypeid_up(int ctypeId) throws Exception;

    public List<CourseList> selectAllCourseByCourseId_down() throws Exception;

    public List<CourseList> selectBytypeid_down(int ctypeId) throws Exception;
}
