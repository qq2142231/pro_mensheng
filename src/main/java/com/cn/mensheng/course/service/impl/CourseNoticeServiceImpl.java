package com.cn.mensheng.course.service.impl;

import com.cn.mensheng.course.module.CourseNotice;
import com.cn.mensheng.course.service.CourseNoticeService;
import com.cn.mensheng.mapper.CourseNoticeCustomMapper;
import com.cn.mensheng.mapper.CourseNoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
@Service("courseNoticeService")
public class CourseNoticeServiceImpl implements CourseNoticeService {
    @Autowired
    private CourseNoticeCustomMapper courseNoticeCustomMapper;
    @Autowired
    private CourseNoticeMapper courseNoticeMapper;
    @Override
    public List<CourseNotice> selectCourseNoticeList(Integer courseId) throws Exception {
        return courseNoticeCustomMapper.selectCourseNoticeListByCourseId(courseId);
    }

    @Override
    public int insertCourseNotice(CourseNotice courseNotice) throws Exception {
        return courseNoticeMapper.insert(courseNotice);
    }

    @Override
    public int deleteCourseNotice(Integer noticeId) throws Exception {
        return courseNoticeMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public int updateCourseNotice(CourseNotice courseNotice) throws Exception {
        return courseNoticeMapper.updateByPrimaryKey(courseNotice);
    }

    @Override
    public CourseNotice selectCourseNotice(Integer noticeId) throws Exception {
        return courseNoticeMapper.selectByPrimaryKey(noticeId);
    }
}
