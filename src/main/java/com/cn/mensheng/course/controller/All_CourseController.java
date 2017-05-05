package com.cn.mensheng.course.controller;

import com.cn.mensheng.course.module.CourseList;
import com.cn.mensheng.course.module.CourseListCustom;
import com.cn.mensheng.course.service.All_CourseService;
import com.cn.mensheng.mapper.All_CourseMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/5/3.
 */
public class All_CourseController {

    private All_CourseService allcourse;

//根据课程id升序
    List<CourseList> selectAllCourseByCourseId_up(Model model) throws Exception{
        PageHelper.startPage(1, 10);
        List<CourseList> courseLists = new ArrayList<CourseList>();
        List<CourseList> courseList = allcourse.selectAllCourseByCourseId_up();
        model.addAttribute("allcourseList",courseList);
        return courseList;
    }
//根据课程id和课程类型id升序
    List<CourseList> selectBytype_up(Model model, int ctypeId) throws Exception {
        PageHelper.startPage(1, 10);
        List<CourseList> courseLists = new ArrayList<CourseList>();
        if(ctypeId != 0){
            List<CourseList> courseList = allcourse.selectAllCourseByCourseId_up();
            model.addAttribute("allcourseList",courseList);
            courseLists = courseList;
        }
        return courseLists;
    }
//根据课程id降序
    List<CourseList> selectAllCourseByCourseId_down(Model model) throws Exception {
        PageHelper.startPage(1, 10);
        List<CourseList> courseLists = new ArrayList<CourseList>();
        List<CourseList> courseList = allcourse.selectAllCourseByCourseId_down();
        model.addAttribute("allcourseList",courseList);
        return courseList;
    }
//根据课程id和课程类型id降序
    List<CourseList> selectBytype_down(Model model, int ctypeId) throws Exception{
        PageHelper.startPage(1, 10);
        List<CourseList> courseLists = new ArrayList<CourseList>();
        if(ctypeId != 0){
            List<CourseList> courseList = allcourse.selectAllCourseByCourseId_up();
            model.addAttribute("allcourseList",courseList);
            courseLists = courseList;
        }
        return courseLists;
    }
}
