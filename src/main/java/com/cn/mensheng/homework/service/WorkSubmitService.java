package com.cn.mensheng.homework.service;

import com.cn.mensheng.dto.WorkSubmit;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
public interface WorkSubmitService {
    //作业提交
    int insertWorkSubmit(WorkSubmit record)throws Exception;
    //老师获取某个作业的学生的提交作业
    List<WorkSubmit> selectWorkSubmitByHomeworkId(Integer homeworkId);
    //老师获取学生所有提交作业
    List<WorkSubmit> selectWorkSubmitByTeacherId(Integer teacherId);
}
