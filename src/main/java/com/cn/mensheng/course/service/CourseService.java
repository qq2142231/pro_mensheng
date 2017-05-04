package com.cn.mensheng.course.service;


import com.cn.mensheng.course.module.*;
import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;


import java.util.List;

/**
 * Created by Leafqun on 2017/4/27.
 */
public interface CourseService {

    public List<CourseNotice> selectCourseNoticeList(Integer courseId) throws Exception;

    public Course selectCourseByPrimaryKey(Integer courseId) throws Exception;

    public List<CourseListCustom> selectCourseListByStuId(Integer stuId) throws Exception;

    public CourseCustom selectByCourseId(Integer courseId)throws Exception;

    public  CourseList selectCourseListByPrimaryKey(CourseListKey key)throws Exception;

    public  List<ChapterCustom> selectCourseContentByCourseId(Integer courseId)throws Exception;

    VideoDetail selectVideoByPrimaryKey(VideoDetailKey key) throws Exception;

    List<Chapter> selectChaptersByCourseId(Integer courseId) throws Exception;

    List<CourseList> selectByPrimaryKey(CourseListKey key) throws Exception;

}
//    CourseCustom selectByCourseId(Integer courseId);

 //   List<CourseListCustom> selectCourseListByStuId(Integer stuId);

  //  List<CourseNotice> selectCourseNoticeListByCourseId(Integer courseId);

    //List<ChapterCustom> selectCourseContentByCourseId(Integer courseId);

    //List<Chapter> selectChaptersByCourseId(Integer courseId);
