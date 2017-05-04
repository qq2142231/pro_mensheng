package com.cn.mensheng.course.controller;

import com.cn.mensheng.course.module.*;
import com.cn.mensheng.course.service.CourseService;
import com.cn.mensheng.course.util.constant;
import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    //根据学生id，获取课程列表，按学习时间排序
    @RequestMapping(value="/courseList")
    @ResponseBody
    public List<CourseListCustom> getCourseList(Model model,Integer stuId) throws Exception{
        List<CourseListCustom> courseListCustom=new ArrayList<CourseListCustom>();
        if(stuId!=null) {
            List<CourseListCustom> courseListCustoms=courseService.selectCourseListByStuId(stuId);
            model.addAttribute("courseList",courseListCustoms);
            courseListCustom=courseListCustoms;
        }
        return courseListCustom;
    }
    //根据课程id获取公告
    @RequestMapping(value="/courseNotice")
    public String getCourseNoticeList(Model model, Integer courseId) throws Exception{
        if(courseId!=null){
            List<CourseNotice> courseNoticeList=courseService.selectCourseNoticeList(courseId);
            model.addAttribute("courseNoticeList",courseNoticeList);
        }
        return "";
    }
    //根据课程id，获取课程内容
    @RequestMapping(value="/courseContent")
    public String getCourse(Model model, Integer courseId, HttpSession session) throws Exception{
        if(courseId!=null){
            Course course=courseService.selectByCourseId(courseId);
            model.addAttribute("course",course);
            if(session!=null){
                Integer stuId= (Integer) session.getAttribute(constant.SESSION_LOGIN_CODE);
                CourseListKey key=new CourseListKey();
                key.setCourseId(course.getCourseId());
                key.setStuId(stuId);
                Boolean isJoin=false;
                if(courseService.selectCourseListByPrimaryKey(key)!=null){
                    isJoin=true;
                }else{
                    isJoin=false;
                }
                model.addAttribute("isJoin",isJoin);
            }
        }
        return "";
    }
    //根据课程id，获取课程内容
    @RequestMapping(value="/courseContent2")
    public String getCourseContent(Model model,Integer courseId) throws Exception{
        if(courseId!=null){
            List<ChapterCustom> chapterList=courseService.selectCourseContentByCourseId(courseId);
            model.addAttribute("chapterList",chapterList);
        }
        return "";
    }
    //根据节id和用户，获取视频
    @RequestMapping(value="/courseContent3")
    public String getVideo(Model model, Integer sectionId,HttpSession session) throws Exception {
        if(sectionId!=null){
            Integer stuId=null;
            if(session!=null){
                stuId= (Integer) session.getAttribute(constant.SESSION_LOGIN_CODE);
            }
            VideoDetailKey key=new VideoDetailKey();
            key.setSectionId(sectionId);
            key.setStuId(stuId);
            VideoDetail videoDetail=courseService.selectVideoByPrimaryKey(key);
            model.addAttribute("videoDetail",videoDetail);
        }
        return "";
    }
    //每章的作业提交时间和发布时间
    @RequestMapping(value="/courseContent4")
    public String getChapters(Model model,Integer courseId) throws Exception {
        if(courseId!=null){
            List<Chapter> chapterList=courseService.selectChaptersByCourseId(courseId);
            model.addAttribute("chapterList",chapterList);
        }
        return "";
    }
}
