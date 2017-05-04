package com.cn.mensheng.student.service.impl;

import com.cn.mensheng.dto.FormInformation;
import com.cn.mensheng.mapper.FormInformationMapper;
import com.cn.mensheng.mapper.StudentMapper;
import com.cn.mensheng.student.service.StudentService;
import com.cn.mensheng.student.service.module.Student;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by l on 2017/4/28.
 */
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    private FormInformationMapper formInformationMapper;
    /*根据学生Id查询学生对象*/
    public Student getStudentByStudentId(int stuId){return studentMapper.selectByPrimaryKey(stuId);}

}
