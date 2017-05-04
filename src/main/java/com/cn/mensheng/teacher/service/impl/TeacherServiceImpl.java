package com.cn.mensheng.teacher.service.impl;

import com.cn.mensheng.mapper.TeacherMapper;
import com.cn.mensheng.teacher.service.TeacherService;
import  com.cn.mensheng.teacher.module.Teacher;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-04-30.
 */
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    public Teacher getTeacherByTeacherId(int teacherId){return teacherMapper.selectByPrimaryKey(teacherId);}
}
