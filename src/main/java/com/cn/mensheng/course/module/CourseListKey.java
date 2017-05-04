package com.cn.mensheng.course.module;

import java.io.Serializable;

public class CourseListKey implements Serializable {
    private Integer stuId;

    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}