package com.cn.mensheng.mapper;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.dto.WorkSubmitKey;

import java.util.List;

public interface WorkSubmitCustomMapper {

    List<WorkSubmit> selectWorkSubmitByHomeworkId(Integer homeworkId);

    List<WorkSubmit> selectWorkSubmitByTeacherId(Integer teacherId);

}