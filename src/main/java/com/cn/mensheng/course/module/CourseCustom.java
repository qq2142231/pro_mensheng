package com.cn.mensheng.course.module;

import com.cn.mensheng.dto.Teacher;

import java.util.List;

/**
 * Created by Leafqun on 2017/4/27.
 */
public class CourseCustom extends Course {
    private CourseType courseType;

    private List<ChapterCustom> chapterList;

    private Teacher teacher;

    public List<ChapterCustom> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<ChapterCustom> chapterList) {
        this.chapterList = chapterList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
}
