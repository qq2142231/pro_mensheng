package com.cn.mensheng.mapper;

import com.cn.mensheng.exam.module.Exam;

public interface ExamMapper {
    int deleteByPrimaryKey(Integer examId);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer examId);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}