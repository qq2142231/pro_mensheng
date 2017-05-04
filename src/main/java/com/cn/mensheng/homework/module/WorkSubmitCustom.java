package com.cn.mensheng.homework.module;

import com.cn.mensheng.student.service.module.Student;
import com.cn.mensheng.teacher.module.Teacher;
import com.cn.mensheng.dto.WorkSubmit;

/**
 * Created by Leafqun on 2017/5/2.
 */
public class WorkSubmitCustom extends WorkSubmit {
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    Teacher teacher;
    Student student;
}
