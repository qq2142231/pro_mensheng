package com.cn.mensheng.course.service.impl;

import com.cn.mensheng.course.module.CourseList;
import com.cn.mensheng.course.module.CourseListCustom;
import com.cn.mensheng.course.module.CourseListKey;
import com.cn.mensheng.course.service.CourseListService;
import com.cn.mensheng.mapper.CourseListCustomMapper;
import com.cn.mensheng.mapper.CourseListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
@Service("courseListService")
public class CourseListServiceImpl implements CourseListService{
    @Autowired
    private CourseListCustomMapper courseListCustomMapper;
    @Autowired
    private CourseListMapper courseListMapper;

    @Override
    public List<CourseListCustom> selectCourseListByStuId(Integer stuId) throws Exception {
        return courseListCustomMapper.selectCourseListByStuId(stuId);
    }

    @Override
    public CourseList selectCourseListByPrimaryKey(CourseListKey key) throws Exception {
        return courseListMapper.selectByPrimaryKey(key);
    }

    @Override
    public int insertCourseList(CourseList courseList) throws Exception {
        return courseListMapper.insert(courseList);
    }

    @Override
    public int deleteCourseList(CourseListKey key) throws Exception {
        return courseListMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateCourseList(CourseList courseList) throws Exception {
        return courseListMapper.updateByPrimaryKey(courseList);
    }
}
