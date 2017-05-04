package com.cn.mensheng.course.module;

import com.cn.mensheng.student.module.StudentCustom;

public class CourseListCustom extends CourseList {
    private CourseCustom course;

    private StudentCustom student;

    public CourseCustom getCourse() {
        return course;
    }

    public void setCourse(CourseCustom course) {
        this.course = course;
    }

    public StudentCustom getStudent() {
        return student;
    }

    public void setStudent(StudentCustom student) {
        this.student = student;
    }
}