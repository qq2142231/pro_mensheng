package com.cn.mensheng.homework.service;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.homework.module.Homework;
import com.cn.mensheng.homework.module.HomeworkCustom;

import java.util.List;

/**
 * Created by Leafqun on 2017/4/28.
 */
public interface HomeworkService {
    //获取每一章的所有作业，内容包括 homeworkId,teacherId, chapterId, homeworkName, content, releasetime，file
    List<Homework> selectHomeworksByChapterId(Integer chapterId) throws Exception;
    //获取某个老师的所有作业,内容包括 homeworkId,teacherId, chapterId, homeworkName, content, releasetime，file
 //   List<Homework> selectHomeworksByTeacherId(Integer teacherId) throws Exception;
    //添加作业
    int insertHomework(Homework homework) throws Exception;
    //更改作业
    int updateHomework(Homework homework) throws Exception;
    //删除作业
    int deleteHomework(Integer homeworkId) throws Exception;
    //根据homeworkId查找作业
    Homework selectHomeworkByHomeworkId(Integer homeworkId) throws Exception;

}
