package com.cn.mensheng.homework.service.impl;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.homework.module.Homework;
import com.cn.mensheng.homework.module.HomeworkCustom;
import com.cn.mensheng.homework.service.HomeworkService;
import com.cn.mensheng.mapper.HomeworkCustomMapper;
import com.cn.mensheng.mapper.HomeworkMapper;

import com.cn.mensheng.mapper.WorkSubmitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Leafqun on 2017/4/28.
 */
@Service("homeworkService")
public class HomeworkServiceImpl implements HomeworkService{
    @Resource
    private HomeworkCustomMapper homeworkCustomMapper;
    @Resource
    private HomeworkMapper homeworkMapper;

    @Override
    public List<Homework> selectHomeworksByChapterId(Integer chapterId) throws Exception {
        return (List)homeworkCustomMapper.selectHomeworksByChapterId(chapterId);
    }

   // @Override
   // public List<Homework> selectHomeworksByTeacherId(Integer teacherId) throws Exception {
  //      return (List)homeworkMapper.selectHomeworksByTeacherId(teacherId);
 //   }

    @Override
    public int insertHomework(Homework homework) throws Exception {
        return homeworkMapper.insert(homework);
    }

    @Override
    public int updateHomework(Homework homework) throws Exception {
        return homeworkMapper.updateByPrimaryKey(homework);
    }

    @Override
    public int deleteHomework(Integer homeworkId) throws Exception {
        return homeworkMapper.deleteByPrimaryKey(homeworkId);
    }

    @Override
    public Homework selectHomeworkByHomeworkId(Integer homeworkId) throws Exception {
        return homeworkMapper.selectByPrimaryKey(homeworkId);
    }

}
