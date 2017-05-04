package com.cn.mensheng.homework.service.impl;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.homework.service.WorkSubmitService;
import com.cn.mensheng.mapper.WorkSubmitCustomMapper;
import com.cn.mensheng.mapper.WorkSubmitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leafqun on 2017/5/2.
 */
@Service("workSubmitService")
public class WorkSubmitServiceImpl implements WorkSubmitService {
    @Autowired
    private WorkSubmitMapper workSubmitMapper;
    @Autowired
    private WorkSubmitCustomMapper workSubmitCustomMapper;
    @Override
    public int insertWorkSubmit(WorkSubmit record) throws Exception {
        return workSubmitMapper.insert(record);
    }

    @Override
    public List<WorkSubmit> selectWorkSubmitByHomeworkId(Integer homeworkId) {
        return workSubmitCustomMapper.selectWorkSubmitByHomeworkId(homeworkId);
    }

    @Override
    public List<WorkSubmit> selectWorkSubmitByTeacherId(Integer teacherId) {
        return workSubmitCustomMapper.selectWorkSubmitByTeacherId(teacherId);
    }
}
