package com.cn.mensheng.mapper;

import com.cn.mensheng.course.module.*;

import java.util.List;

/**
 * Created by lenovo on 2017/5/2.
 */
public interface All_CourseMapper {

    List<CourseList> selectAllCourseByCourseId_up();

    List<CourseList> selectBytypeid_up(Integer ctypeId);

    List<CourseList> selectAllCourseByCourseId_down();

    List<CourseList> selectBytypeid_down(Integer ctypeId);

}
