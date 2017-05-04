package com.cn.mensheng.course.service.impl;


import com.cn.mensheng.course.module.*;
import com.cn.mensheng.course.service.CourseService;
import com.cn.mensheng.mapper.*;
import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leafqun on 2017/4/27.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseCustomMapper courseCustomMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseListMapper courseListMapper;
    @Autowired
    private VideoDetailMapper videoDetailMapper;
    @Override
    public List<CourseNotice> selectCourseNoticeList(Integer courseId) throws Exception {
        return courseCustomMapper.selectCourseNoticeListByCourseId(courseId);
    }

    @Override
    public Course selectCourseByPrimaryKey(Integer courseId) throws Exception {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public List<CourseListCustom> selectCourseListByStuId(Integer stuId) throws Exception {
        return courseCustomMapper.selectCourseListByStuId(stuId);
    }

    @Override
    public CourseCustom selectByCourseId(Integer courseId) throws Exception {
        return courseCustomMapper.selectByCourseId(courseId);
    }

    @Override
    public CourseList selectCourseListByPrimaryKey(CourseListKey key) throws Exception {
        return courseListMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<ChapterCustom> selectCourseContentByCourseId(Integer courseId) throws Exception {
        return courseCustomMapper.selectCourseContentByCourseId(courseId);
    }

    @Override
    public VideoDetail selectVideoByPrimaryKey(VideoDetailKey key) throws Exception {
        return videoDetailMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<Chapter> selectChaptersByCourseId(Integer courseId) throws Exception {
        return courseCustomMapper.selectChaptersByCourseId(courseId);
    }

}
