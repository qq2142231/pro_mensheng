package com.cn.mensheng.mapper;

import com.cn.mensheng.question.module.QuestionType;

public interface QuestionTypeMapper {
    int deleteByPrimaryKey(Integer qtypeId);

    int insert(QuestionType record);

    int insertSelective(QuestionType record);

    QuestionType selectByPrimaryKey(Integer qtypeId);

    int updateByPrimaryKeySelective(QuestionType record);

    int updateByPrimaryKey(QuestionType record);
}